package cn.edu.gzu.baifujun;

import java.io.*;

public class RandomAccessFileTest {

	public static void main(String args[]) throws IOException{
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            String s=in.readLine();
            RandomAccessFile myFile=new RandomAccessFile("test7.log","rw");
            myFile.seek(myFile.length());  //移动到文件结尾
            myFile.writeBytes(s+"\n");  //写入数据
            myFile.close();
        }
        catch(IOException e){}
    }

}
