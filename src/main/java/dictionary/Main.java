package main.java.dictionary;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.DefinitionType;
import main.java.dictionary.factory.DefinitionFactory;
import main.java.dictionary.request.Request;
import main.java.dictionary.request.RequestParser;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.factory.DefinitionFactory;
import main.java.dictionary.repository.DictionaryRepository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DictionaryRepository repository = new DictionaryRepository();
        DefinitionFactory factory = new DefinitionFactory();
        Word word = new Word("Hello");
        Definition definition = factory.creatDefinition("-n","xin chao");
        word.addDefinetion(definition);
        repository.save(word);
        Word result  =repository.find("Hello");
        if (result != null){
            System.out.println(result.getKeyWord());
            for (Definition item : result.getDefinitions()){
                System.out.println(item.getMeaning());
                System.out.println(item.getType()   );
            }
        }else {
            System.out.println("ko tim thay");
        }

    }
}
