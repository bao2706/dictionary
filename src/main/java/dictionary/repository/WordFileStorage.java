package main.java.dictionary.repository;

import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WordFileStorage {

    private final String folderPath;

    public WordFileStorage(String folderPath) {
        this.folderPath = folderPath;
    }
    public boolean delete(String keyWord) {

        String fileName = keyWord + ".def";

        File file = new File(folderPath, fileName);

        if (!file.exists()) {
            return false;
        }

        return file.delete();
    }
    public void save(Word word) {

        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String fileName =
                word.getKeyWord() + ".def";

        File file =
                new File(folder, fileName);


        try (FileWriter writer = new FileWriter(file)) {

            writer.write(
                    "@" + word.getKeyWord() + "\n"
            );

            for (Definition definition
                    : word.getDefinitions()) {

                writer.write(
                        "TYPE="
                                + definition.getType()
                                + "\n"
                );

                writer.write(
                        "MEANING="
                                + definition.getMeaning()
                                + "\n"
                );

                for (ExampleSentence example
                        : definition.getExamples()) {

                    writer.write(
                            "EXAMPLE="
                                    + example.getSentence()
                                    + "\n"
                    );

                    writer.write(
                            "EXAMPLE_MEANING="
                                    + example.getMeaning()
                                    + "\n"
                    );
                }

                writer.write("---\n");
            }

            System.out.println(
                    "Đã lưu file: " + file.getPath()
            );

        } catch (IOException exception) {
            System.out.println(
                    "Không thể lưu từ: "
                            + exception.getMessage()
            );
        }
    }
}