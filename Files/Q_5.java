import java.io.*;
import java.util.Scanner;

//(L2)Write a program to create a file and write data into it using the methods OutputStream class.
public class Q_5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File file=new File("D:\\Java\\Files\\Q_5_File");
        file.createNewFile();
        OutputStream outputStream=new FileOutputStream(file);
        System.out.print("Enter The Name: ");
        String name=scanner.nextLine();
        outputStream.write(name.getBytes());
        System.out.println("File is writed...");
    }
}
