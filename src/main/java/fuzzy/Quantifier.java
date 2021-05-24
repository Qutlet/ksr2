package fuzzy;

import java.util.*;

public class Quantifier {

    private static Quantifier quantifier = new Quantifier();
    public static Quantifier getInstance(){ return quantifier;}
    private TrapezoidalFunction trapezoidalFunction = TrapezoidalFunction.getInstance();
    private TriangularFunction triangularFunction =  TriangularFunction.getInstance();

    private List<String> quantifierAbsolute = new ArrayList<>(Arrays.asList("Less then 5000 ","About 5000","About 6000","About 7000","About 8000","About 10000","About 11000","More than 12500"));
    private List<String> quantifierRelative = new ArrayList<>(Arrays.asList("None","About 20%","Less than a third","About 33%","About 45%","More than a half","About 60%","Majority","All"));


    public String getQuantifierAbsolute(int index) {
        return quantifierAbsolute.get(index);
    }

    public String getQuantifierRelative(int index) {
        return quantifierRelative.get(index);
    }

    public int calculateQuantifierAbsolute(double x){
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0,0,4000,5000,x),0)); // 0 0 4000 5000
        memberships.add(new Membership(triangularFunction.getMembership(4000,5000,6000,x),1));
        memberships.add(new Membership(triangularFunction.getMembership(5000,6000,7000,x),2));
        memberships.add(new Membership(triangularFunction.getMembership(6000,7000,8000,x),3));
        memberships.add(new Membership(triangularFunction.getMembership(7000,8000,9200,x),4));
        memberships.add(new Membership(triangularFunction.getMembership(9000,10000,11000,x),5));
        memberships.add(new Membership(triangularFunction.getMembership(10000,11000,12700,x),6));
        memberships.add(new Membership(trapezoidalFunction.getMembership(12500,12700,14500,145000,x),7));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() -1).getA());
        int rand = (int)(Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateQuantifierRelative(double x) {
        ArrayList<Double> membership = new ArrayList<>();
        membership.add(triangularFunction.getMembership(0, 0, 0.05, x));
        membership.add(triangularFunction.getMembership(0.12, 0.2, 0.28, x));
        membership.add(trapezoidalFunction.getMembership(0, 0, 0.3, 0.33, x));
        membership.add(triangularFunction.getMembership(0.27, 0.33, 0.39, x));
        membership.add(triangularFunction.getMembership(0.35, 0.45, 0.5, x));
        membership.add(trapezoidalFunction.getMembership(0.5, 0.55, 1, 1, x));
        membership.add(triangularFunction.getMembership(0.52, 0.62, 0.68, x));
        membership.add(triangularFunction.getMembership(0.75,0.8,0.9,x));
        membership.add(trapezoidalFunction.getMembership(0.85,0.9,1,1,x));
        return 0;
    }

}

