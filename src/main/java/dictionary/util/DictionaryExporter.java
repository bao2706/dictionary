package main.java.dictionary.util;
import java.io.FileWriter;
import java.io.IOException;
public class DictionaryExporter {
    public void export(String filePath){
        try {
            FileWriter writer= new FileWriter(filePath);
            writer.write("Dictionary exported!");
            writer.close();
            System.out.println("Save thanh cong");
        } catch (IOException e) {
            System.out.println("ko the xuat file"+ e.getMessage());
        }
    }
}
