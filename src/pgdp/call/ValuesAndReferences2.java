package pgdp.call;

public class ValuesAndReferences2 {

    public static void main(String[] args) {
        foo();
    }

    // Was wird hier ausgegeben? Warum?
    // Versuche, die Methode sumAndDifference() so umzuschreiben,
    // dass sie die spezifizierten Anforderungen erfüllt.
    // Wo stößt du auf Probleme? Kann man die Methode so einfach
    // fixen?
    public static void foo() {
        int a = 7;
        int b = 4;
        sumAndDifference(a, b);
        System.out.println("a == " + a);
        System.out.println("b == " + b);
    }

    // Schreibt die Summe von a und b in a und die Differenz in b (??)
    public static void sumAndDifference(int a, int b) {
        int tmp = a;
        a = a + b;
        b = tmp - a;
    }
}
