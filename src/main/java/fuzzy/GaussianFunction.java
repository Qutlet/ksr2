package fuzzy;

public class GaussianFunction {

    private static GaussianFunction gaussianFunction = new GaussianFunction();
    public static GaussianFunction getInstance(){return gaussianFunction;}


    public double getMembership(double a,double b,double x) {
        return Math.exp(-0.5*Math.pow((x - mX(a,b))/a(a,b),2));
    }

    private double mX(double a,double b){
        return (a + b)/2.0;
    }

    private double a(double a,double b){
        return Math.sqrt((Math.pow(a - mX(a,b),2) + Math.pow(b -mX(a,b),2))/2);
    }

}
