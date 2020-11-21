public class Triangle {

    private static Point a;
    private static Point b;
    private static Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double getSquare() {
        return 0.5 * ((b.getX() - a.getX()) * (c.getY() - a.getY()) -
                      (c.getX() - a.getX()) * (b.getY() - a.getY()));
    }

    public static boolean isIsosceles() {
        return  Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)) ==
                Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2))
                ||
                Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2)) ==
                Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
    }
}
