package util;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
public class FileTransfer {
    private int bufferSize = 1024;

    public String getExtension(String fileName){
        //获得某文件名的拓展名
        String[] parts = fileName.split("\\.");
        return parts[parts.length - 1];
    }
    public void transfer(String filePath, File file) throws IOException {
        //io传递文件
        byte[] buffer = new byte[bufferSize];
        int len = 0;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            fileInputStream = new FileInputStream(file);
            while((len = fileInputStream.read(buffer)) > 0){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
