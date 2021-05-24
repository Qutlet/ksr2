import fuzzy.LinguisticSummary;

public class Main {

    public static void main(String[] args){
        DataBase dataBase = DataBase.getSelf();
        dataBase.connect();
        LinguisticSummary linguisticSummary = new LinguisticSummary();
        System.out.println(linguisticSummary.test3());
    }

}
