package pgdp.call;

public class ValuesAndReferences3 {

    public static void main(String[] args) {
        foo();
    }

    // Was wird in dieser Methode ausgegeben?
    // Kannst du die Methode rotate() umschreiben,
    // sodass sie die Anforderungen erfüllt, ohne
    // ihre Signatur zu ändern?
    public static void foo() {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(3, 1);
        Point p3 = new Point(-1, 4);
        rotate(p1, p2, p3);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
    }

    // Rotiert die Variablen p1, p2 und p3 einmal durch (??)
    // !! Nicht geometrisch, sondern einfach nur die Variablen !!
    // p1 wird zu p2, p2 zu p3, p3 zu p1
    public static void rotate(Point p1, Point p2, Point p3) {
        Point tmp = p1;
        p1 = p2;
        p2 = p3;
        p3 = tmp;
    }
}

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}