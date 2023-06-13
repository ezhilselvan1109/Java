//(L2)Write a program to get the input from the user and store it into file. Using Reader and Writer file.

import java.io.*;

public class Q_7 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Java\\Files\\Q_7_File");
        file.createNewFile();
        FileWriter writer=new FileWriter(file);
        writer.write("ezhil");
        writer.close();
        FileReader fileReader=new FileReader(file);
        int i=0;
        while ((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
