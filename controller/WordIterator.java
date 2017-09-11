import java.util.Iterator;

public class WordIterator implements Iterator {
    int index;

    public WordIterator(FileContent content) {

    }

    @Override
    public boolean hasNext() {
       if(index < ####.size()){
          return true;
       }
       return false;
    }

    @Override
    public Object next() {
       if(this.hasNext()){
          return ####.get(index++);
       }
       return null;
   }
}
