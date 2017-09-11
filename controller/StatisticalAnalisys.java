package controller;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.ArithmeticException;
import java.util.Arrays;

public class StatisticalAnalisys {

    private HashSet<String> uniqueList;
    private int size;
    private Iterator<String> iterator;
    private ArrayList<String> vowels = new ArrayList<String>();
    private ArrayList<String> notVowels = new ArrayList<String>();

    public StatisticalAnalisys(Iterator<String> iterator) {
        this.uniqueList = new HashSet<String>();
        this.size = 0;
        this.iterator = iterator;
        this.loadInfo();
    }

    // public int countOf(String... stringInput) {
    //
    // return null;
    // }

    public int dictionarySize(){
        return this.uniqueList.size();
    }

    public int size() {
        return this.size;
    }

    public float getVowelsPercentage() {
        return (float) this.vowels.size() / this.notVowels.size() * 100;
    }

    private void loadInfo() {
        final String[] VOWELS = {"a", "o", "i", "e", "u"};
        while(this.iterator.hasNext()) {
            String current = this.iterator.next();
            this.uniqueList.add(current);
            this.size++;
            if(Arrays.asList(VOWELS).contains(current)) {
                this.vowels.add(current);
            } else {
                this.notVowels.add(current);
            }
        }
    }
    // public Set<String> occurMoreThan(Integer times) {
    //
    //     return null;
    // }
}
