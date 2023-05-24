package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//字节输入流的编写
public class InputStreamStu {
    //inputStream是字节输入流的超类
    public static void main(String[] args) throws IOException {
        int a = 0;
        FileInputStream fileInputStream = new FileInputStream("D:/IoTest/测试.txt");
        //调用一次,读取每个字符的ascii码,直到最后结果为-1
        while ( (a = fileInputStream.read()) != -1){
            System.out.println((char)a);

        }
        int c = 100;
        System.out.println((char)c);
        fileInputStream.close();
        byte[] by = new byte[16];
        int read = fileInputStream.read(by);
        System.out.println(new String(by));
        fileInputStream.close();
        byte[] str = {100,121,100};
        char ch = 'd';
        int hh = (int) ch;
        byte ha = (byte) hh;
        byte[] yiyi = {ha};
        System.out.println(new String(yiyi));
        System.out.println(new String(str));


    }

}
