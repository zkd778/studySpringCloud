package com.example.studyprovider.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileService {
    //读取文件
    boolean readFileAndSave(String prefix,String path);
//    读取所有txt
    void readFile(String path) throws IOException;
}
