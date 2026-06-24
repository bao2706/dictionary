package main.java.dictionary.request;
import java.util.ArrayList;
import java.util.List;

public class RequestParser {
    public Request parse(String input){
        String[] parts = input.trim().split("\\s+");
        String action =parts[0];
        List<String> params = new ArrayList<>();
        String keyWord = null;
        if(parts.length==2){
            keyWord= parts[1];
        }
        if(parts.length== 3){
            params.add(parts[1]);
            keyWord =parts[2];
        }
        return new Request(action,params,keyWord);
    }
}
