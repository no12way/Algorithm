package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//关于字节输出流的的超级接口
public class OutStreamStu {
    public static void main(String[] args) throws IOException {
        //true表示追加
        FileOutputStream fileOutputStream = new FileOutputStream("D:/IoTest/测试.txt",true);
        byte[] by = {98,99,100};
        //char转成byte比较难,不做展示
        fileOutputStream.write(by);
        //getbytes将字符串转换成字节数组
        fileOutputStream.write("你好".getBytes());
        fileOutputStream.close();

    }
}
