package main.java.dictionary.util;

import java.io.FileWriter;

import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.entity.Definition;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

public class DictionaryExporter {
    public void export(String filePath, List<Word> words) {
        try {
            FileWriter writer = new FileWriter(filePath);

            for (Word word : words) {
                writeWord(writer, word);
            }
            writer.close();
            System.out.println("Save thanh cong");
        } catch (IOException e) {
            System.out.println("ko the xuat file" + e.getMessage());
        }
    }

    private void writeWord(FileWriter writer, Word word)
            throws IOException {
        writer.write("@" + word.getKeyWord() + "\n");
        for (Definition definition : word.getDefinitions()) {
            writer.write("loai: " + definition.getType() + "\n");
            writer.write("-" + definition.getMeaning() + "\n");
            for (ExampleSentence exampleSentence : definition.getExamples()) {
                writer.write("=" + exampleSentence.getSentence() + "\n");
                writer.write("=" + exampleSentence.getMeaning() + "\n");
            }
        }
        writer.write("\n");
    }
}
