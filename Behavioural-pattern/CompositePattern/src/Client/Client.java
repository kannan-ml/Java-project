package Client;

import com.example.java.composite.Directory;
import com.example.java.composite.File;
import com.example.java.composite.binaryFile;

public class Client {
    public static void main(String[] args){
        File result=createTree();
        result.ls();
    }
    public static  File createTree(){
        File dir1=new Directory("Kannan");
        File f1=new binaryFile("Design patter",26);
        dir1.addFile(f1);
        File dir2=new Directory("Kannan1");
        File f2=new binaryFile("Design patter2",26);
        File f3=new binaryFile("Design patter3",26);
        File f4=new binaryFile("Design patter4",26);
        dir2.addFile(f2);
        dir2.addFile(f3);
        dir2.addFile(f4);
        dir2.addFile(dir1);
                return dir2;


    }
}
