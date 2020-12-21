public class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;
    private final double sideLengthAB;
    private final double sideLengthAC;
    private final double sideLengthBC;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideLengthAB = getSideLength(a, b);
        this.sideLengthAC = getSideLength(a, c);
        this.sideLengthBC = getSideLength(b, c);
    }

    public double getSideLength(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }


    public double getSquare() {
        double p = (sideLengthAB + sideLengthBC + sideLengthAC) / 2;
        return Math.sqrt(p * (p - sideLengthAB) * (p - sideLengthAC) * (p - sideLengthBC));
    }

    public boolean isIsosceles() {
        return  sideLengthAB == sideLengthBC || sideLengthAB == sideLengthAC || sideLengthAC == sideLengthBC;           // I must improve here boolean logic
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c;
    }
}
