package com.example.studyprovider.service.impl;

import com.example.studyprovider.service.FileService;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.stereotype.Service;
import sun.plugin.javascript.navig.Array;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

@Service
public class FileServiceImpl implements FileService {
//    读取一个文件的内容
    @Override
    public boolean readFileAndSave(String prefix, String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\java\\stock-center\\OemData\\SH\\000001");
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
//    读取多个文件内容
    @Override
    public void readFile(String path) throws IOException {
        String path1 = "C:\\Users\\Admin\\Desktop\\java\\stock-center\\OemData\\SH";
        File file = new File(path1);
        File[] files = file.listFiles();
        Arrays.sort(files);
        for (int i = 0; i<files.length;i++){
            if (files[i].isFile()){
                InputStreamReader reader = new InputStreamReader(new FileInputStream(files[i]));
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = "";
                line = bufferedReader.readLine();
                while (line != null){
                    System.out.println(files[i].getName()+":"+line);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
            }
        }
    }

}
