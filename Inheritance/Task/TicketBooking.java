import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize = 0;
        MovieTicket[] movieTicket=new MovieTicket[10];
        Ticket ticket=new Ticket();
        Scanner scan = new Scanner(System.in);
        ticket.seatfreeponniyinSelvan();
        ticket.seatfreenaaneVaruven();

        while (true) {
		System.out.println("\n\n\t\t\t  Movie Ticket \n");
            System.out.println("\t\t\t1 - Ticket Booking\n\t\t\t2 - Ticket Booked List\n\t\t\t3 - Available Ticket\n\t\t\t4 - Exit");
            System.out.print("Enter The Choice: ");
            int choice = scan.nextInt();
            int movie;
            switch (choice) {
                case 1:
                    System.out.println("\t\t\t1 - Ponniyin Selvan\n\t\t\t2 - Naane Varuven");
                    System.out.print("Enter The Choice: ");
                    movie=scan.nextInt();
                    movieTicket[arraySize]=new MovieTicket();
                    movieTicket[arraySize].ticketBooking(movie);
                    arraySize++;
                    break;
                case 2:
                    System.out.println("\t\tname\t Age\tMovie Name\tNo of Ticket\tAmount");
                    for (int i = 0; i < arraySize; i++) {
                        movieTicket[i].print();
                    }
                    break;
                case 3:
                    System.out.println("\t\t\t1 - Ponniyin Selvan\n\t\t\t2 - Naane Varuven");
                    System.out.print("Enter The Choice: ");
                    movie=scan.nextInt();
                    ticket.ticketBooking(movie);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}




class Ticket{
    private static int naaneVaruvenCount=10;
    private static int ponniyinSelvanCount=10;
    static int seatPonniyin[]=new int[10];
    static int seatNaane[]=new int[10];

    public void seatfreeponniyinSelvan(){
        for(int i=0;i<10;i++){
                seatPonniyin[i]=0;
        }
    }
    public void seatfreenaaneVaruven(){
        for(int i=0;i<2;i++){
                seatPonniyin[i]=0;
        }
    }
    public int getBookCount(int movie){
        if(movie==1) {
            return ponniyinSelvanCount;
        }else if(movie==2){
            return naaneVaruvenCount;
        }
        return 0;
    }

    public void setBookCount(int bookCount,int movie) {
        if(movie==1) {
            this.ponniyinSelvanCount = bookCount;
        }else if(movie==2){
            this.naaneVaruvenCount = bookCount;
        }
    }

    public void ticketBooking(int movie){
        if(movie==1) {
            System.out.println("\t\t\tAvailable Ticket: " + ponniyinSelvanCount);
        }else if(movie==2){
            System.out.println("\t\t\tAvailable Ticket: " + naaneVaruvenCount);
        }
    }

    public void seatPrintPonniyin(){
        System.out.println("\t\t+---+---+---+---+---+");
        int k=0;
        for (int i = 0; i < 2; i++) {
            System.out.print("\t\t| ");
            for (int j = 0; j < 5; j++) {
                if (seatPonniyin[k] ==0) {
                    System.out.print(" " + " | ");
                } else {
                    System.out.print('B' + " | ");
                }
                k++;
            }
            System.out.println();
            System.out.println("\t\t+---+---+---+---+---+");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Seat No: ");
        int seatNo = scan.nextInt();

        if (seatPonniyin[seatNo-1]==0) {
            seatPonniyin[seatNo-1] = 1;
            System.out.println("\t\t\tSeat Booked");
        } else {
            System.out.println("\t\t\tAlready Booked !");
            seatPrintPonniyin();
        }

    }

    public void seatPrintNaane() {
        int k = 0;
        System.out.println("\t\t+---+---+---+---+---+");
        for (int i = 0; i < 2; i++) {
            System.out.print("\t\t| ");
            for (int j = 0; j < 5; j++) {
                if (seatNaane[k] == 0) {
                    System.out.print(" " + " | ");
                } else {
                    System.out.print('B' + " | ");
                }
                k++;
            }
            System.out.println();
            System.out.println("\t\t+---+---+---+---+---+");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Seat No: ");
        int seatNo = scan.nextInt();

        if (seatNaane[seatNo-1] == 0) {
            seatNaane[seatNo-1] = 1;
            System.out.println("\t\t\tSeat Booked");
        } else {
            System.out.println("\t\t\tAlready Booked !");
            seatPrintNaane();
        }
    }

}


class MovieTicket extends Ticket{
    private String name,movieName;
    private int age,amount,noOfTicket;
    public void ticketBooking(int movie){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Name: ");
        name=scan.next();
        System.out.print("Enter The Age: ");
        age=scan.nextInt();
        System.out.print("Enter The No Of Ticket: ");
        noOfTicket= scan.nextInt();
        int ticket=getBookCount(movie);
        if(movie==1){
            movieName="Ponniyin Selvan";
        }else if(movie==2){
            movieName="Naane Varuven";
        }
        int t=0;
        while (t<noOfTicket) {
            if(movie==1){
                seatPrintPonniyin();
            }else if(movie==2){
                seatPrintNaane();
            }
            t++;
        }
            if (ticket < noOfTicket) {
                super.ticketBooking(movie);
                ticketBooking(movie);
            } else {
                ticket -= noOfTicket;
                amount = 100 * noOfTicket;
                System.out.println("\t\t\tAmount: " + amount + "\n");
                System.out.println("\t\t    SuccessFully Booked !");
            }

            setBookCount(ticket, movie);
    }
    public void print(){
        System.out.println("\t\t"+name+"\t"+age+"\t"+movieName+"\t"+noOfTicket+"\t\t"+amount);
    }
}
