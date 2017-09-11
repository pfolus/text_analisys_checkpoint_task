import java.util.Iterator;
import java.util.Scanner;


public class FileContent implements IterableText {
    private String fileName;

    public FileContent(String fileName) {
        this.fileName = fileName;
    }

    public Iterator<String> charIterator() {
        Iterator<String> charIterator = new CharIterator<String>();

        return charIterator;
    }

    public Iterator<String> wordIterator() {
        Iterator<String> wordIterator = new WordIterator<String>();

        return wordIterator;
    }

    public String getFileName() {
        return this.fileName;
    }

}
