package cn.edu.gzu.baifujun;

import java.io.*;

public class FileWriterTest {

	public static void main(String args[]){
        try{
            FileWriter a=new FileWriter("test2.txt");
            for(int i=32;i<126;i++){
                a.write(i);
            }
            a.write("\n白福军");
            a.close();
        }
        catch(IOException e){}
    }

}
