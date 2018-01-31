public class Fraction implements Comparable<Fraction> {
    private int num;
    private int den;


    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Bannað að deila með núlli");
        }
        this.num = numerator;
        this.den = denominator;
    }

    public Fraction plus(Fraction f) {
        return new Fraction(this.num * f.den + f.num * this.den, this.den * f.den);
    }

    public boolean equals(Fraction f) {
        // Hér þarf að skrifa kóða
        return false;
    }

    @Override
    public int compareTo(Fraction f) {
        // Hér þarf að skrifa kóða
        return 0;
    }

    public static void main(String args[]) {
        Fraction p = new Fraction(1, 2);
        Fraction r = new Fraction(-1, -2);
        Fraction q = new Fraction(2, 6);
        Fraction s = new Fraction(1, 4);
        Fraction t = new Fraction(2, 4);

        // Prófum hvort .equals aðferðin sé sjálfhverf (þarf að vera satt)
        System.out.println("p.equals(p): " + p.equals(p));
        // Prófum hvort .equals aðferðin sé samhverf (þarf að vera eins)
        System.out.println("p.equals(r): " + p.equals(r));
        System.out.println("r.equals(p): " + r.equals(p));
        // Prófum hvort .equals aðferðin sé gegnvirk (allt þarf að vera eins)
        System.out.println("p.equals(r): " + p.equals(r));
        System.out.println("r.equals(t): " + r.equals(t));
        System.out.println("p.equals(t): " + p.equals(t));
        // Prófum hvort .equals aðferðin hafni samanburði við null (þarf að vera false):
        System.out.println("t.equals(null): " + t.equals(null));

        // Prófum hvort .compareTo sé sjálfhverf (þarf að vera 0)
        System.out.println("q.compareTo(q): " + q.compareTo(q));

        // Prófum hvort .compareTo sé andsamhverf (þarf að vera mismunandi)
        System.out.println("r.compareTo(q): " + r.compareTo(q));
        System.out.println("q.compareTo(r): " + q.compareTo(r));

        // Prófum hvort .compareTo sé gegnvirk (allt þarf að vera eins)
        System.out.println("r.compareTo(q): " + r.compareTo(q));
        System.out.println("q.compareTo(s): " + q.compareTo(s));
        System.out.println("r.compareTo(s): " + r.compareTo(s));

    }


}
