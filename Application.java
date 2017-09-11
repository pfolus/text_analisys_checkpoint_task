import controller.CharIterator;
import controller.FileContent;
import controller.IterableText;
import controller.StatisticalAnalisys;
import controller.WordIterator;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Application {

    public static void main(String[] args) {
        Map<Integer, FileContent> files = new HashMap<>();

        for (int i = 0; i < args.length; ++i) {
            FileContent file = new FileContent(args[i]);
            files.put(i, file);
        }

        FileContent file1 = new FileContent(args[0]);
        Iterator wi1 = file1.wordIterator();
        Iterator ci1 = file1.charIterator();
        StatisticalAnalisys sa1 = new StatisticalAnalisys(wi1);
        StatisticalAnalisys sa2 = new StatisticalAnalisys(ci1);
        System.out.println(sa1.dictionarySize());
        System.out.println(sa2.dictionarySize());

    }

}
