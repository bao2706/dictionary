package main.java.dictionary;

import main.java.dictionary.controller.DictionaryController;
import main.java.dictionary.entity.Word;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.service.DictionaryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DictionaryService service = DictionaryService.getInstance();
        Word positive = new Word("positive");
        Word apple = new Word("apple");
        Word book = new Word("book");

        service.saveWord(positive);
        service.saveWord(apple);
        service.saveWord(book);
        for (Word word : service.findAllWords()){
            System.out.println(word.getKeyWord());
        }
    }
}