package main.java.dictionary;

import main.java.dictionary.repository.WordFileStorage;

public class Main {

    public static void main(String[] args) {

        WordFileStorage storage =
                new WordFileStorage("data");

        boolean deleted =
                storage.delete("positive");

        System.out.println(
                "Xóa file thành công: " + deleted
        );
    }
}