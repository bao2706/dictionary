package main.java.dictionary.service;
import main.java.dictionary.entity.Word;
import main.java.dictionary.repository.DictionaryRepository;

public class DictionaryService {
    private static DictionaryService instance;
    private DictionaryRepository dictionaryRepository;
    private DictionaryService(){
        dictionaryRepository = new DictionaryRepository();
    }
    public static DictionaryService getInstance(){
        if (instance == null){
            instance= new DictionaryService();
        }
        return instance;

    }
}
