package main.java.dictionary;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dictionary App started!");
        Word word = new Word("hello");
        Definition definition = new Definition("xin chao");
        ExampleSentence exampleSentence = new ExampleSentence("hello, my friens","xin chao ban iu cua toi");
        definition.addExamples(exampleSentence);
        word.addDefinetion(definition);
        System.out.println(word.getKeyWord());
        for (Definition item : word.getDefinitions()){
            System.out.println(
                    "dinh nghia" + item.getMeaning()
            );
            for(ExampleSentence example : item.getExamples()  ){
                System.out.println("cau vd :" + example.getMeaning());
                System.out.println("cau vd :" + example.getSentence());
        }


            }

        }
    }