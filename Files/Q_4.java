//(L2)Write a program to create a directory and check whether the directory is created.
import java.io.File;

public class Q_4 {
    public static void main(String[] args) {
        File file=new File("D:\\Java\\Files\\FilesTask");
        if(file.isDirectory()==false){
            file.mkdir();
            System.out.println("Directory is created");
        }else {
            System.out.println("Directory is already exists");
        }
    }
}
