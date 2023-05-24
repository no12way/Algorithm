package io;

import java.io.File;
import java.io.IOException;

//实现io流的文件创建
public class FileCreate {
    public static void main(String[] args) {
        File file = new File("D:/IoTest/测试.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getAbsoluteFile());
        File file1 = new File("D:/IoTest/a/B/c");
        boolean mkdir = file1.mkdirs();
        System.out.println(mkdir);
        file1.mkdir();
    }
}
