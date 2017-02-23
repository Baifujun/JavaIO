package cn.edu.gzu.baifujun;

import java.io.*;

public class FileInputOutputStreamTest3 {

	public static void main(String args[]){
        String fileName="test5.dat";
        int sum=0;
        try{
            DataInputStream a=new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            sum+=a.readInt();
            sum+=a.readInt();
            sum+=a.readInt();
            System.out.println("三个数的和为："+sum);
            a.close();
        }
        catch(IOException e){
            System.out.println("出现错误！"+fileName);
        }
    }

}
