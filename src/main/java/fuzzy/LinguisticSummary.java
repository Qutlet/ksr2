package fuzzy;

public class LinguisticSummary {
    private Quantifier quantifier = Quantifier.getInstance();
    private Summarizer summarizer = Summarizer.getInstance();

    public String test3(){
        double test2 = 45.0;
        String test3 = "games played";
        String test1 = "basketball players ";
        return quantifier.getQuantifierAbsolute(quantifier.calculateQuantifierAbsolute(1)) + test1 + "is/have " + summarizer.getSummarizerListNormal(summarizer.calculateGamesPlayed(test2)) + test3;
    }

}
