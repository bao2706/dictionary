package main.java.dictionary.entity;
import java.util.LinkedList;
import java.util.List;

public class Definition {
    private String meaning;
    private List<ExampleSentence> examples;

    public Definition(String meaning) {
        this.meaning = meaning;
        this.examples = new LinkedList<>();
    }

    public String getMeaning() {
        return meaning;
    }

    public List<ExampleSentence> getExamples() {
        return examples;
    }
    public void addExamples(ExampleSentence exampleSentence){
        examples.add(exampleSentence);
    }
}
