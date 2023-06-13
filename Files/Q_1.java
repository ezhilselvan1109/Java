//(L1)Write a program to show how to read and write a file.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q_1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("D:\\Java\\Files\\Q_1_file.txt");
        FileReader fileReader=new FileReader("D:\\Java\\Files\\Q_1_file.txt");
        fileWriter.write("Hello This is the Question 1 File");
        fileWriter.close();
        int i;
        while ((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();

    }
}
