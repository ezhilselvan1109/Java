//(L2)Write a program to accept a specified number of characters as input and converts them into uppercase characters.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=scanner.nextInt();
        File file=new File("D:\\Java\\Files\\Q_6_File");
        file.createNewFile();
        FileWriter writer=new FileWriter(file);
        int i=0;
        while (i<number){
            System.out.print("Enter The Character: ");
            char ch=scanner.next().charAt(0);
            if(97>=ch && ch<=122) {
                writer.write(ch);
            }else{
                ch -= 32;
                writer.write(ch);
            }
            i++;
        }
        writer.close();
        FileReader fileReader=new FileReader(file);
        i=0;
        while ((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
