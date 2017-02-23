package cn.edu.gzu.baifujun;

import java.io.*;

public class FileInputOutputStreamTest4 {

	public static void main(String args[]) throws IOException{
        DataInputStream a=new DataInputStream(System.in);
        System.out.print("请输入一个整数：");
        int b=a.readInt();
        int sum=0;
        int c=b;
        while(c>0){
            int d=c%10;  //取最低位
            c=c/10;  //去掉最低位
            sum=sum+d;  //累加各位之和
        }
        System.out.println(b+"的各位数字之和="+sum);
    }

}
