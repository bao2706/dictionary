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
        if (action.equals("define")){
            handleDefine(request);
            return;
        }
        if (action.equals("drop")){
            handleDrop(request);
            return;
        }
        System.out.println("chuc nang nay chua ho tro " +action);
    }

    private void handleDrop(Request request) {
        String keyWord = request.getKeyWord();
        if( keyWord == null || keyWord.isBlank()){
            System.out.println("ban chua nhap tu can xoa");
            return;
        }
        boolean deleted = service.drop(keyWord);
        if (deleted){
            System.out.println("@"+keyWord+ " dropped!!");
        }else {
            System.out.println("ko tim thay tu "+ keyWord   );
        }
    }

    private void handleDefine(Request request){
        String keyWord = request.getKeyWord();
        if (request.getParams().isEmpty()){
            System.out.println("chua co dinh nghia");
            return;
        }
        String option = request.getParams().get(0);
        System.out.println("nhap dinh nghia");
        String sentence  = scanner.nextLine();

        ExampleSentence example =null;
        if (optionCheck(option)){
            System.out.println("nhap cau vi du");
            String Example = scanner.nextLine();
            if (!Example.isBlank()){
                System.out.println("nghia cau");
                String sentenceExample = scanner.nextLine();
                example =
                        new ExampleSentence(sentence ,sentenceExample);
            }
    }
    }
    private  boolean optionCheck(String option){
        return option.equals("-n")
                || option.equals("--noun")
                || option.equals("-a")
                || option.equals("--adjective")
                || option.equals("-v")
                || option.equals("--verb");
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