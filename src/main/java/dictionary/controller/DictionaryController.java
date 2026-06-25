package main.java.dictionary.controller;

import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.request.Request;
import main.java.dictionary.service.DictionaryService;

import java.util.Scanner;

public class DictionaryController {

    private Scanner scanner;
    private DictionaryService service;

    public DictionaryController(Scanner scanner, DictionaryService service) {
        this.scanner = scanner;
        this.service = service;
    }
    public void handle(Request request) {
        String action = request.getAction();
        if (action.equals("lookup") ){
            handleLookup(request);
            return;
        }
        System.out.println("chuc nang nay chua ho tro " +action);
    }

    private void handleLookup(Request request) {
        String keyWord = request.getKeyWord();
        Word word = service.lookup(keyWord);
        if (keyWord == null){
            System.out.println("ko tim thay tu" +keyWord);
            return;
        }
        System.out.println("@"+word.getKeyWord());
        for (Definition item :word.getDefinitions()){
            System.out.println(item.getType());
            System.out.println(item.getMeaning());
            for (ExampleSentence exampleSentence : item.getExamples()){
                System.out.println(exampleSentence.getMeaning());
                System.out.println(exampleSentence.getSentence());
            }
        }
    }
}