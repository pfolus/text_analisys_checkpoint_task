package controller;

import view.View;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class FileContent implements IterableText {
    private String fileName;
    private ArrayList<String> words;
    private ArrayList<String> chars;

    public FileContent(String fileName) {
        this.fileName = fileName;
        this.words = new ArrayList<String>();
        this.chars = new ArrayList<String>();
        this.loadWords();
        this.loadChars();
    }

    public Iterator<String> charIterator() {
        Iterator<String> charIterator = new CharIterator(this);

        return charIterator;
    }

    public Iterator<String> wordIterator() {
        Iterator<String> wordIterator = new WordIterator(this);

        return wordIterator;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ArrayList<String> getWordsList() {
        return this.words;
    }

    public ArrayList<String> getCharsList() {
        return this.chars;
    }

    private void loadWords() {

        try {
            Scanner scanner = new Scanner(new File(this.fileName));

            while(scanner.hasNext()) {
                this.words.add(scanner.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            View.print("nie znaleziono pliku!");
            System.exit(0);
        }
    }
    private void loadChars() {

        try {
            Scanner scanner = new Scanner(new File(this.fileName));
            scanner.useDelimiter("");

            while(scanner.hasNext()) {
                this.chars.add(scanner.next().toLowerCase());
            }

        this.chars.removeAll(Arrays.asList(" "));

        } catch (FileNotFoundException e) {
            View.print("nie znaleziono pliku!");
            System.exit(0);
        }
    }
}
