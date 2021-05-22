package fuzzy;

class Membership implements Comparable<Membership>{
    double a;
    int id;

    public Membership(double a, int id) {
        this.a = a;
        this.id = id;
    }

    public double getA() {
        return a;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Membership o) {
        return Double.compare(a,o.getA());
    }

    @Override
    public String toString() {
        return "Membership{" +
                "a=" + a +
                ", id=" + id +
                '}';
    }
}