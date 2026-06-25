package main.java.dictionary.repository;
import main.java.dictionary.entity.Word;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
public class DictionaryRepository {
    private Map<String, Word> wordMap;
    private List<Word> wordList;

    public DictionaryRepository() {
        this.wordMap = new HashMap<>();
        this.wordList = new LinkedList<>();
    }
    public void save(Word word){
        String keyWord = word.getKeyWord();
        if(wordMap.containsKey(keyWord)){
            wordMap.put(keyWord,word);
            return;
        }
        wordMap.put(keyWord,word);
        addWordinAlphabeticaOrder(word);

    }
    public void delete(String keyWord){
        wordMap.remove(keyWord);
        if (keyWord !=null){
            wordList.remove(keyWord);
        }
    }

    public List<Word> findAll() {
        return new LinkedList<>(wordList);
    }
    private void addWordinAlphabeticaOrder(Word newWord){
        int index;

        for (index = 0; index < wordList.size(); index++) {
            Word currentWord = wordList.get(index);

            if (newWord.getKeyWord()
                    .compareToIgnoreCase(currentWord.getKeyWord()) < 0) {
                break;
            }
        }
        wordList.add(index,newWord);
    }

    public Word find(String keyWord){
        return wordMap.get(keyWord);
    }
    public boolean exists(String keyword){
        return wordMap.containsKey(keyword);
    }
}
