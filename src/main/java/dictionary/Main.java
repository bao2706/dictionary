package main.java.dictionary;

import main.java.dictionary.controller.DictionaryController;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.DefinitionType;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.service.DictionaryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        RequestParser parser =
                new RequestParser();

        DictionaryController controller =
                new DictionaryController(
                        scanner,
                        service
                );

        System.out.print("Action: ");

        String input = scanner.nextLine();

        Request request = parser.parse(input);

        controller.handle(request);

        scanner.close();
    }
}