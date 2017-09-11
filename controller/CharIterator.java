package controller;

import java.util.Iterator;
import java.util.ArrayList;

public class CharIterator implements Iterator {
    private int index;
    public ArrayList<String> chars;

    public CharIterator(FileContent content) {
        this.chars = content.getCharsList();
    }

    @Override
    public boolean hasNext() {
       if(index < this.chars.size()){
          return true;
       }
       return false;
    }

    @Override
    public Object next() {
       if(this.hasNext()){
          return this.chars.get(index++);
       }
       return null;
   }
}
