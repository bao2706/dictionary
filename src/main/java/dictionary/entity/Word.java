package main.java.dictionary.entity;
import java.util.List;
import java.util.LinkedList;
public class Word {
    private String keyWord;
    private List<Definition> definitions;

    public Word(String keyWord) {
        this.keyWord = keyWord;
        this.definitions = new LinkedList<>();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
    public void addDefinetion(Definition definition){
        definitions.add(definition);
    }
}
