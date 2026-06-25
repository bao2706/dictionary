package main.java.dictionary.repository;
import main.java.dictionary.entity.Word;

import java.util.HashMap;
import java.util.Map;
public class DictionaryRepository {
    private Map<String, Word> wordMap;

    public DictionaryRepository() {
        this.wordMap = new HashMap<>();
    }
    public void save(Word word){
        wordMap.put(word.getKeyWord(),word);
    }
    public void delete(String keyWord){
        wordMap.remove(keyWord);
    }
    public Word find(String keyWord){
        return wordMap.get(keyWord);
    }
    public boolean exists(String keyword){
        return wordMap.containsKey(keyword);
    }
}
