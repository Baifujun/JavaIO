package cn.edu.gzu.baifujun;

import java.io.*;

public class FileInputOutputStreamTest {

	public static void main(String args[]){
        char ch;
        int data;
        try{
            FileInputStream a=new FileInputStream(FileDescriptor.in);  //创建文件输入流对象
            FileOutputStream b=new FileOutputStream("test4.txt");  //创建文件输出流对象
            System.out.println("请输入字符，以#号结束：");
            while((ch=(char)a.read())!='#'){
                b.write(ch);
            }
            a.close();
            b.close();
            System.out.println();
            FileInputStream c=new FileInputStream("test4.txt");
            FileOutputStream d=new FileOutputStream(FileDescriptor.out);
            while(c.available()>0){
               data=c.read();
               d.write(data);
           }
           c.close();d.close();
       }
       catch(FileNotFoundException e){
          System.out.println("找不到该文件！");
       }
       catch(IOException e){}
    }

}
