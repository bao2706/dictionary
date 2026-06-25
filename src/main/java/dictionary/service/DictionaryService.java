package main.java.dictionary.service;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.ExampleSentence;
import main.java.dictionary.entity.Word;
import main.java.dictionary.factory.DefinitionFactory;
import main.java.dictionary.repository.DictionaryRepository;

public class DictionaryService {
    private static DictionaryService instance;

    private final DictionaryRepository repository;
    private final DefinitionFactory definitionFactory;
    private DictionaryService(){
        repository = new DictionaryRepository();
        definitionFactory = new DefinitionFactory();
    }
    public static DictionaryService getInstance(){
        if (instance == null){
            instance= new DictionaryService();
        }
        return instance;

    }
    public void saveWord(Word word){
        repository.save(word);
    }
    public Word lookup(String keyWord){
        return repository.find(keyWord);
    }
    public Word define(String option,
                       String keyWord,
                       String meaning,
                       ExampleSentence example){
        String normolizedKeyWord = keyWord.trim().toLowerCase();
        Word word = repository.find(keyWord);
        if (word == null){
            word = new Word(normolizedKeyWord);
            System.out.println("@"+normolizedKeyWord+"tu chua ton tai da tao tu moi");
        }
        Definition definition = definitionFactory.creatDefinition(option, meaning);
        if (example != null){
            definition.addExamples(example);
        }
        word.addDefinetion(definition);
        repository.save(word);
        return word;
    }
}
