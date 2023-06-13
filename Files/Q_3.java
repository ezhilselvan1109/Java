//(L1)Write a program to rename the given file, after renaming the file delete the renamed file. (Accept the file name using command line arguments.)

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q_3 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Java\\Files\\"+args[0]);
        if(file.exists()==false){
            file.createNewFile();
            System.out.print("File Name: "+file.getName());
            System.out.println(" is created");
        }
        File file1=new File("D:\\Java\\Files\\Q_3_Rename_file.txt");
        if(file.exists()==false){
            file1.createNewFile();
            System.out.print("File Name: "+file.getName());
            System.out.println(" is created");
        }
        boolean flag=file.renameTo(file1);
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        else {
            System.out.println("Operation Failed");
        }
        boolean filedelete=file1.delete();
        System.out.println(filedelete);
    }
}