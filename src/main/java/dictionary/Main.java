package main.java.dictionary;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.entity.ExampleSentence;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dictionary App started!");
        ExampleSentence exampleSentence = new ExampleSentence("hello","xin chao");
        System.out.println("cau vi du : " +
                exampleSentence.getSentence());
        System.out.println("nghia : " +
                exampleSentence.getMeaning());
    }
}