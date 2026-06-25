package main.java.dictionary.entity;
import java.util.LinkedList;
import java.util.List;

public class Definition {
    private DefinitionType type;
    private String meaning;
    private List<ExampleSentence> examples;


    public Definition(DefinitionType type, String meaning) {
        this.meaning = meaning;
        this.examples = new LinkedList<>();
        this.type=type;
    }

    public String getMeaning() {
        return meaning;
    }

    public List<ExampleSentence> getExamples() {
        return examples;
    }

    public DefinitionType getType() {
        return type;
    }

    public void addExamples(ExampleSentence exampleSentence){
        examples.add(exampleSentence);
    }
}
