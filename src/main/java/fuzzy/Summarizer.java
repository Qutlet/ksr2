package fuzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summarizer {

    private static Summarizer summarizer = new Summarizer();
    public static Summarizer getInstance(){return summarizer;}

    private List<String> summarizerListNormal = new ArrayList<>(Arrays.asList("a few","small amount","average amount","large amount","great number"));

    public String getSummarizerListNormal(int index) {
        return summarizerListNormal.get(index);
    }

}
