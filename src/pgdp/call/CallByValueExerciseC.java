package pgdp.call;

public class CallByValueExerciseC {

    public static void main(String[] args) {
        foo();
    }

    // Was wird in dieser Methode ausgegeben?
    // Kannst du die Methode swap() umschreiben,
    // sodass sie die Anforderungen erfüllt, ohne
    // ihre Signatur zu ändern?
    public static void foo() {
        Point p1 = new Point(3, 1);
        Point p2 = new Point(-1, 4);
        swapReally(p1, p2);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }

    // Vertauscht die Punkte p1 und p2 (??)
    public static void swap(Point p1, Point p2) {               //behandelt die Punkte als Objekte
        Point tmp = p1;
        p1 = p2;
        p2 = tmp;
    }
    public static void swapReally(Point p1, Point p2) {         //arbeitet mit der Attribute der Punkte
        int xTmp= p1.x;
        int yTmp= p1.y;
        p1.x= p2.x;
        p1.y= p2.y;
        p2.x= xTmp;
        p2.y= yTmp;
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