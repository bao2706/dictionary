package main.java.dictionary;

import main.java.dictionary.util.DictionaryExporter;

public class Main {

    public static void main(String[] args) {

        DictionaryExporter exporter =
                new DictionaryExporter();

        exporter.export("dictionary.txt");
    }
}