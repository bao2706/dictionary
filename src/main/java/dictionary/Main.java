    package main.java.dictionary;

    import main.java.dictionary.entity.Word;
    import main.java.dictionary.repository.DictionaryRepository;

    public class Main {

        public static void main(String[] args) {

            DictionaryRepository repository =
                    new DictionaryRepository();

            Word positive = new Word("positive");
            Word apple = new Word("apple");
            Word book = new Word("book");

            repository.save(positive);
            repository.save(apple);
            repository.save(book);

            System.out.println("Danh sách từ:");

            for (Word word : repository.findAll()) {
                System.out.println(word.getKeyWord());
            }
        }
    }