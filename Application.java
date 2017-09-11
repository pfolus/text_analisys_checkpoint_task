import controller.CharIterator;
import controller.FileContent;
import controller.IterableText;
import controller.StatisticalAnalisys;
import controller.WordIterator;
import view.View;

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

        for(Map.Entry<Integer, FileContent> entry:files.entrySet()){
            int key=entry.getKey();
            FileContent file = entry.getValue();
            Iterator wordIterator = file.wordIterator();
            Iterator charIterator = file.charIterator();

            StatisticalAnalisys wordAnalisys = new StatisticalAnalisys(wordIterator);
            StatisticalAnalisys charAnalisys = new StatisticalAnalisys(charIterator);

            View.print("\n");
            View.print("==" + file.getFileName() + "==");
            View.print("\n");
            View.print("Char count: " + charAnalisys.size());
            View.print("Word count: " + wordAnalisys.size());
            View.print("Unique words: " + wordAnalisys.dictionarySize());
            View.print("Vovels %: " + charAnalisys.getVowelsPercentage());

        }
    }
}
