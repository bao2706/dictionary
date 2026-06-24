package main.java.dictionary.request;
import java.util.List;
public class Request {
    private String action;
    private List<String> params;
    private String keyWord;

    public Request(String action,
                   List<String> params,
                   String keyWord) {
        this.action = action;
        this.params = params;
        this.keyWord = keyWord;
    }

    public String getAction() {
        return action;
    }

    public List<String> getParams() {
        return params;
    }

    public String getKeyWord() {
        return keyWord;
    }
}
