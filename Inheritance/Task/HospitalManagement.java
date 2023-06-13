//Create a simple hospital management system using inheritance in Java

import  java.util.Scanner;

class Hospital
{

    public static void main(String args[])
    {
        Doctor[] doctor = new Doctor[10];
        Patient[] patient = new Patient[10];
        Staff[] staff=new Staff[5];

        doctor[0]=new Doctor(101,"Dr.Ghanendra","ENT","MBBS,MD",1,100);
        doctor[1]=new Doctor(102,"Dr.Vikram","Physician","MBBS,MD",2,200);
        doctor[2]=new Doctor(103,"Dr.Vikram","Physician","MBBS,MD",3,150);
        doctor[3]=new Doctor(104,"Dr.Rekha","Surgeon","BDM",4,100);
        doctor[4]=new Doctor(105,"Dr.Pramod","Artho","MBBS,MS",5,200);

        patient[0]=new Patient("ezhil","fever", 22);
        patient[1]=new Patient("selvan","Cold",21);
        patient[2]=new Patient("akash","Cold",23);
        patient[3]=new Patient("Ravi","fever",25);

        staff[0]=new Staff(12,"ezhil",1500);
        int doctorCounts = 5,patientCount=3;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\tHOSPITAL MANAGEMENT SYSTEM");
        System.out.println("--------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int choice,i;
        Staff Staffobj=new Staff();
        while (true){
            System.out.println("\t\t\t1 - PATIENT\n\t\t\t2 - STAFF");
            System.out.print("Enter The Choice: ");
            int Choice=input.nextInt();
            switch (Choice){
                case 1:
                    while (true) {
                        System.out.println("\t\t\t1 - Appointment \n\t\t\t2 - Report\n\t\t\t3 - Doctor Details\n\t\t\t4 - Back");
                        System.out.print("Enter The Choice: ");
                        int innerChoice = input.nextInt();
                        boolean flag=false;
                        switch (innerChoice) {
                            case 1:
                                patient[patientCount].newPatient();
                                patientCount++;
                                break;
                            case 2:
                                System.out.print("Enter The Name: ");
                                String name=input.next();
                                boolean flag1=true,flag2=true;
                                for(i=0;i<patientCount;i++){
                                    if(name.toUpperCase().equals(patient[i].getName().toUpperCase())){
                                        flag2=false;
                                        if(patient[i].getAdmitStatus()=="Yes"){
                                            patient[i].getPatientReport();
                                            flag1=false;
                                        }
                                    }
                                }
                                if(flag1 &&(!flag2)){
                                    System.out.println("\t\t\tSorry! Not Approval");
                                }
                                if(flag2){
                                    System.out.println("\t\t\tNot in The List");
                                }
                                break;
                            case 3:
                                System.out.println("id \t   Name\t   \tSpecilist \tQualification\tRoom No");

                                for(i=0;i<doctorCounts;i++){
                                    doctor[i].doctorDetails();
                                }
                                break;
                            case 4:
                                flag=true;
                                break;
                        }
                        if(flag){
                            break;
                        }
                    }
                    break;
                case 2: {
                    while (true) {
                        System.out.println("\t\t\t1 - Approval\n\t\t\t2 - Appointment List\n\t\t\t3 - Patient Report List \n\t\t\t4 - Staff List\n\t\t\t5 - Back");
                        System.out.print("Enter The Choice: ");
                        int innerChoice = input.nextInt();
                        boolean flag = false;
                        switch (innerChoice) {
                            case 1:
                                Staffobj.giveApproval(patient,patientCount,doctor,doctorCounts);
                                break;
                            case 2:
                                for(i=0;i<patientCount;i++){
                                    if(patient[i].getAdmitStatus()=="no") {
                                        patient[i].patientEntryDetails();
                                    }
                                }
                                break;
                            case 3:
                                for(i=0;i<patientCount;i++){
                                    if(patient[i].getAdmitStatus()=="Yes") {
                                        patient[i].getPatientReport();
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Id\tName\tSalary");
                                staff[0].staffDetails();
                                break;
                            case 5:
                                flag = true;
                                break;
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}


class Staff extends MemberStaff{
    int salary;

    public Staff(){}
    public Staff(int id,String name,int salary){
        super(id,name);
        this.salary=salary;
    }

    Doctor doctorObj=new Doctor();
    public void giveApproval(Patient[] patient, int patientCount, Doctor[] doctor, int doctorCounts) {
        int i;
        Scanner input = new Scanner(System.in);
        for(i=0;i<patientCount;i++){
            if(patient[i].getAdmitStatus()=="no"){
                patient[i].patientEntryDetails();
                System.out.print("(1) - Granted  (2)- Waiting");
                int grand=input.nextInt();
                if(grand==1){
                    System.out.print("Enter The Id: ");
                    int id=input.nextInt();
                    patient[i].setId(id);
                    patient[i].setAdmitStatus();
                    System.out.print("Enter The Doctor Room No: ");
                    int roomNo=input.nextInt();
                    int amount=doctorObj.doctorVisit(roomNo,doctor,doctorCounts);
                    patient[i].setMedicalAmount(amount);
                    System.out.println("\t\t\tAmount: "+amount);
                }
            }
        }
    }

    void staffDetails(){
        super.print();
        System.out.println(salary);
    }

}

class Doctor extends MemberStaff{
    private String specilist,qualification;
    private int roomNo,fees;
    public Doctor(){}


    public Doctor(int id,String name,String specilist,String qualification,int roomNo,int fees){
        super(id,name);
        this.specilist=specilist;
        this.qualification=qualification;
        this.roomNo=roomNo;
        this.fees=fees;
    }
    void doctorDetails()
    {
        super.print();
        System.out.println( specilist + "     \t"  + qualification + "       \t" + roomNo+"\n");
    }
    public int doctorVisit(int roomNo, Doctor[] doctor, int doctorCounts){
        int amount=0;
        for(int i=0;i< doctorCounts;i++){
            if (roomNo == doctor[i].roomNo) {
                amount += doctor[i].fees;
            }
        }
        return amount;
    }
}
class Patient {
    private String Id, Name, Disease, AdmitStatus;
    private int Age,MedicalAmount;
    public Patient(String Name,String Disease,int Age){
        this.Id="0";
        this.Name=Name;
        this.Disease=Disease;
        this.AdmitStatus="no";
        this.Age=Age;
    }
    public String getName() {
        return Name;
    }
    public String getAdmitStatus() {
        return AdmitStatus;
    }

    public void setAdmitStatus(){
        this.AdmitStatus="Yes";
    }
    public void setId(int id){
        this.Id= String.valueOf(id);
    }
    public void setMedicalAmount(int amount){
        this.MedicalAmount=amount;
    }
    void newPatient(){
        Scanner input = new Scanner(System.in);
        Id = "0";
        System.out.print("Enter The Patient name:- ");
        Name = input.nextLine();
        System.out.print("Enter The Patient disease:- ");
        Disease = input.nextLine();
        AdmitStatus = "no";
        System.out.print("Enter The Patient age:- ");
        Age = input.nextInt();
    }
    void patientEntryDetails()
    {
        System.out.println(Name + " \t" + Disease + "     \t" +  Age);
    }
    void getPatientReport()
    {
        System.out.println(Id + "\t" + Name + " \t" + Disease + "     \t" + AdmitStatus + "\t" + Age+ "\t" +MedicalAmount);
    }
}

class MemberStaff{
    String name;
    int id;
    public MemberStaff(){}
    public MemberStaff(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void print(){
        System.out.print(id+"\t"+name+"\t");
    }
}