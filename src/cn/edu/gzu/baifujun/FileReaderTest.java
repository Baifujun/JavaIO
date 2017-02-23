package cn.edu.gzu.baifujun;

import java.io.*;

class FileReaderTest{
	
    public static void main(String args[]) throws IOException{
        char a[]=new char[1000]; //创建可容纳 1000 个字符的数组
        FileReader b = new FileReader("test1.txt");
        int num = b.read(a); //将数据读入到数组 a 中，并返回字符数
        b.close();
        String str = new String(a,0,num); //将字符数组转换成字符串
        System.out.println("读取的字符个数为："+num+",内容为：\n");
        System.out.println(str);
    }
    
}
