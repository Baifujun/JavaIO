package cn.edu.gzu.baifujun;

import java.io.*;

public class BufferedWriterTest {

	public static void main(String args[]){
        String str=new String();
        try{
            BufferedReader in = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("test3.txt"));
            while((str = in.readLine()) != null){
                System.out.println(str);
                out.write(str);  //将读取到的 1 行数据写入输出流
                out.newLine();  //写入换行符
            }
            out.flush();
            in.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("出现错误"+e);
        }
    }

}
