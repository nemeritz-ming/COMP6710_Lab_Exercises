package comp1110.lab8;

/**
 * Represents a function mapping from a point (x,y) to another point.
 */
public class Map {
    final private double a, b, c, d, e, f; // Map parameters

    public Map(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /**
     * Apply the function
     * f([x,y]) = [ax + by + e, cx + dy + f] (rounded to integer)
     */
    public Point applyMap(int x, int y) {
        return new Point((int) Math.round(a * x + b * y + e), (int) Math.round(c * x + d * y + f));
    }

}
