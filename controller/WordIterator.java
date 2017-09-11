package controller;

import java.util.Iterator;
import java.util.ArrayList;

public class WordIterator implements Iterator {
    private int index;
    public ArrayList<String> words;

    public WordIterator(FileContent content) {
        this.words = content.getWordsList();
    }

    @Override
    public boolean hasNext() {
       if(index < this.words.size()){
          return true;
       }
       return false;
    }

    @Override
    public Object next() {
       if(this.hasNext()){
          return this.words.get(index++);
       }
       return null;
   }
}
