package controller;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class StatisticalAnalisys {

    private HashSet<String> uniqueList;
    private int size;
    private Iterator<String> iterator;

    public StatisticalAnalisys(Iterator<String> iterator) {
        this.uniqueList = new HashSet<String>();
        this.size = 0;
        this.iterator = iterator;

    }

    // public int countOf(String... stringInput) {
    //
    // return null;
    // }

    public int dictionarySize(){
        while(this.iterator.hasNext()) {
            uniqueList.add(this.iterator.next());
        }
        return this.uniqueList.size();
    }

    public int size() {
        while(this.iterator.hasNext()) {
            this.size++;
            this.iterator.next();
        }
        return this.size;
    }
}
    // public Set<String> occurMoreThan(Integer times) {
    //
    //     return null;
    // }
