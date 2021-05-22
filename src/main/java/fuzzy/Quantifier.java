package fuzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quantifier {

    private static Quantifier quantifier = new Quantifier();
    public static Quantifier getInstance(){ return quantifier;}
    private TrapezoidalFunction trapezoidalFunction = TrapezoidalFunction.getInstance();
    private TriangularFunction triangularFunction =  TriangularFunction.getInstance();

    private List<String> quantifierAbsolute = new ArrayList<>(Arrays.asList("Less then 5000","About 5000","About 6000","About 7000","About 8000","About 10000","About 11000","More than 12500"));
    private List<String> quantifierRelative = new ArrayList<>(Arrays.asList("None","About 20%","Less than a third","About 33%","About 45%","More than a half","About 60%","Majority","All"));


    public String getQuantifierAbsolute(int index) {
        return quantifierAbsolute.get(index);
    }

    public String getQuantifierRelative(int index) {
        return quantifierRelative.get(index);
    }

    public int calculateQuantifierAbsolute(double x){
        ArrayList<Double> memberships = new ArrayList<>();
        memberships.add(trapezoidalFunction.getMembership(0,0,4000,5000,x)); // 0 0 4000 5000
        memberships.add(triangularFunction.getMembership(4000,5000,6000,x));
        memberships.add(triangularFunction.getMembership(5000,6000,7000,x));
        memberships.add(triangularFunction.getMembership(6000,7000,8000,x));
        memberships.add(triangularFunction.getMembership(7000,8000,9200,x));
        memberships.add(triangularFunction.getMembership(9000,10000,11000,x));
        memberships.add(triangularFunction.getMembership(10000,11000,12700,x));
        memberships.add(trapezoidalFunction.getMembership(12500,12700,14500,145000,x));
        //Collections.sort();
        return 0;
    }

}
