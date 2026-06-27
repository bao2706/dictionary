package main.java.dictionary;

import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.DefinitionType;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.service.DictionaryService;
import main.java.dictionary.util.DictionaryExporter;

public class Main {

    public static void main(String[] args) {

        DictionaryService service =
                DictionaryService.getInstance();

        Word positive = new Word("positive");

        Definition definition =
                new Definition(
                        DefinitionType.ADJECTIVE,
                        "tích cực"
                );

        ExampleSentence exampleSentence =
                new ExampleSentence(
                        "a positive factor",
                        "một nhân tố tích cực"
                );

        definition.addExamples(exampleSentence);

        positive.addDefinetion(definition);

        service.saveWord(positive);

        DictionaryExporter exporter =
                new DictionaryExporter();

        exporter.export(
                "dictionary.txt",
                service.findAllWords()
        );


    }
}