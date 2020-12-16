package com.example.studyprovider;

import com.example.studyprovider.service.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class StudyProviderApplicationTests {
    @Autowired
    private FileService fileService;

    @Test
    void contextLoads() {
    }

    @Test
    public void readFileAndSave(){
        fileService.readFileAndSave("SH","C:\\Users\\Admin\\Desktop\\java\\stock-center\\OemData\\SH\\000001");
    }

    @Test
    public void readFile() throws IOException {
        fileService.readFile("C:\\Users\\Admin\\Desktop\\java\\stock-center\\OemData\\SH");
    }




    //InputStream   一个字节
    @Test
    public void Tset1() {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\io\\InputStream.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1){
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //InputStreamReader 将字节流转换为字符流    一个
    @Test
    public void test2(){

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\io\\InputStream.txt");
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            int i = 0;
            while ((i =reader.read()) != -1){
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //BufferedReader  一行
    @Test
    public void test3(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\io\\InputStream.txt");  //读取字节
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader buffered = new BufferedReader(reader);
            String line;
            while ((line =buffered.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
