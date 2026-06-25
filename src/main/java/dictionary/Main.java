package main.java.dictionary;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.DefinitionType;
import main.java.dictionary.factory.DefinitionFactory;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.factory.DefinitionFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dictionary App started!");
        Word word = new Word("hello");
        DefinitionFactory factory = new DefinitionFactory();
        Definition definition =factory.creatDefinition("-n","hello");
        ExampleSentence exampleSentence = new ExampleSentence("hello, my friens","xin chao ban iu cua toi");
        ExampleSentence exampleSentence1 = new ExampleSentence("hello, my mom","xin chao me iu cua con");

        System.out.println(definition.getType());
        System.out.println(definition.getMeaning());
        }


            }
