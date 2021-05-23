package fuzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summarizer {

    private static Summarizer summarizer = new Summarizer();

    public static Summarizer getInstance() {
        return summarizer;
    }

    private TrapezoidalFunction trapezoidalFunction = TrapezoidalFunction.getInstance();
    private TriangularFunction triangularFunction = TriangularFunction.getInstance();
    private GaussianFunction gaussianFunction = GaussianFunction.getInstance();

    private List<String> summarizerListNormal = new ArrayList<>(Arrays.asList("a few ", "small amount of ", "average amount of ", "large amount of ", "great number of "));
    private List<String> summarizerListHeight = new ArrayList<>(Arrays.asList("quite short ", "short ", "medium-height ", "height ", "very height"));
    private List<String> summarizerListWeight = new ArrayList<>(Arrays.asList("thin ", "slim ", "medium weight ", "bonny ", "stout "));

    public String getSummarizerListNormal(int index) {
        return summarizerListNormal.get(index);
    }

    public String getSummarizerListHeight(int index) {
        return summarizerListHeight.get(index);
    }

    public String getSummarizerListWeight(int index) {
        return summarizerListWeight.get(index);
    }

    public int calculateGamesPlayed(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 13, 23, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(13, 23, 30, 40, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(30, 44, 57, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(47, 57, 64, 74, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(64, 85, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateFieldGoalsMade(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 170, 210, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(180, 210, 375, 405, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(375, 488, 601, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(571, 601, 767, 797, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(767, 978, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateThreePointsMade(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 21, 45, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(21, 45, 95, 119, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(95, 135, 174, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(150, 174, 205, 229, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(205, 272, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateTurnovers(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 55, 81, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(55, 81, 124, 150, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(124, 172, 219, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(193, 219, 262, 288, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(262, 344, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculatePersonalFouls(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 57, 87, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(57, 87, 130, 160, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(130, 183, 236, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(206, 236, 281, 311, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(281, 371, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateRebounds(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 230, 270, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(230, 270, 442, 482, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(442, 579, 715, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(715, 755, 908, 948, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(908, 371, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateAssists(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 145, 185, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(145, 185, 350, 390, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(350, 463, 575, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(535, 575, 720, 760, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(720, 925, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateSteals(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 35, 55, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(35, 55, 80, 100, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(80, 118, 155, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(145, 155, 170, 190, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(170, 225, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateBlocks(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 45, 75, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(45, 75, 107, 137, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(107, 153, 199, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(169, 199, 230, 260, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(230, 307, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculatePoints(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(0, 0, 534, 594, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(534, 594, 1101, 1161, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(1101, 1415, 1728, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(1668, 1728, 2235, 2295, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(2235, 2832, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateHeight(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(160, 160, 169, 177, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(169, 177, 183, 191, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(183, 194, 205, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(197, 205, 211, 219, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(211, 229, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }

    public int calculateWeight(double x) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership(trapezoidalFunction.getMembership(59, 59, 83, 95, x), 0)); // 0 0 4000 5000
        memberships.add(new Membership(trapezoidalFunction.getMembership(83, 95, 106, 118, x), 1));
        memberships.add(new Membership(triangularFunction.getMembership(106, 123, 139, x), 2));
        memberships.add(new Membership(trapezoidalFunction.getMembership(127, 139, 149, 161, x), 3));
        memberships.add(new Membership(gaussianFunction.getMembership(149, 170, x), 4));
        memberships.sort(Membership::compareTo);
        memberships.removeIf(Membership -> Membership.getA() != memberships.get(memberships.size() - 1).getA());
        int rand = (int) (Math.random() * memberships.size());
        return memberships.get(rand).getId();
    }
}
