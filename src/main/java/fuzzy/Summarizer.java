package fuzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summarizer {

    private static Summarizer summarizer = new Summarizer();
    public static Summarizer getInstance(){return summarizer;}
    private TrapezoidalFunction trapezoidalFunction = TrapezoidalFunction.getInstance();
    private TriangularFunction triangularFunction =  TriangularFunction.getInstance();
    private GaussianFunction gaussianFunction = GaussianFunction.getInstance();

    private List<String> summarizerListNormal = new ArrayList<>(Arrays.asList("a few ","small amount of ","average amount of ","large amount of ","great number of "));
    private List<String> summarizerListHeight = new ArrayList<>(Arrays.asList("quite short ","short ","medium-height ","height ","very height"));
    private List<String> summarizerListWeight = new ArrayList<>(Arrays.asList("thin ","slim ","medium weight ","bonny ","stout "));

    public String getSummarizerListNormal(int index) {
        return summarizerListNormal.get(index);
    }

    public String getSummarizerListHeight(int index) {
        return summarizerListHeight.get(index);
    }

    public String getSummarizerListWeight(int index) {
        return summarizerListWeight.get(index);
    }

    public int calculateGamesPlayed(double x){
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0,0,13,23,x),0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(13,23,30,40,x),1));
        memberships.add(new Membership(triangularFunction.getMembership(30,44,57,x),2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(47,57,64,74,x),3));
        memberships.add(new Membership(gaussianFunction.getMembership(64,85,x),4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() -1).getA());
        int rand = (int)(Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

}
