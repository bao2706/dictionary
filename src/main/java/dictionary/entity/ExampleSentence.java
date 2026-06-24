package main.java.dictionary.entity;

public class ExampleSentence {
    private String sentence;
    private String meaning;

    public ExampleSentence(String sentence, String meaning) {
        this.sentence = sentence;
        this.meaning = meaning;
    }

    public String getSentence() {
        return sentence;
    }

    public String getMeaning() {
        return meaning;
    }
}
