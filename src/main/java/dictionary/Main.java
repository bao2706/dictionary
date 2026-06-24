package main.java.dictionary;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.entity.ExampleSentence;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dictionary App started!");
        Definition definition = new Definition("xin chao");
        ExampleSentence exampleSentence1 = new ExampleSentence("hello"," xin chao");
        ExampleSentence exampleSentence2 =new ExampleSentence("goodbye"," tam biet");

        definition.addExamples(exampleSentence1);
        definition.addExamples(exampleSentence2);

        System.out.println("dinh nghia " + definition.getMeaning());
        for (ExampleSentence example : definition.getExamples()){
            System.out.println(example.getMeaning());
            System.out.println(example.getSentence());
        }
    }
}