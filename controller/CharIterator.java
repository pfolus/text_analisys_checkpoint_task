import java.util.iterator;

public class CharIterator implements Iterator {
    int index;

    public CharIterator(FileContent content) {

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
