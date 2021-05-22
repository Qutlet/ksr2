package fuzzy;

public class TrapezoidalFunction {

    private static TrapezoidalFunction trapezoidalFunction = new TrapezoidalFunction();
    public static TrapezoidalFunction getInstance(){return trapezoidalFunction;}


    public double getMembership(double a,double b, double c, double d, double x) {
        if (x <= a) {
            return 0.0;
        }
        else if (x > a && x < b) {
            return (x - a) / (b - a);
        }
        else if (x >= b && x <= c) {
            return 1.0;
        }
        else if (x > c && x < d) {
            return (d - x) / (d - c);
        }
        else return 0.0; // x >= d
    }
}
