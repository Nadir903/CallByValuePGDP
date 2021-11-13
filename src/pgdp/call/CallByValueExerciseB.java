package pgdp.call;

import java.sql.Wrapper;

public class CallByValueExerciseB {

    public static void main(String[] args) {
        foo();
    }

    // Was wird hier ausgegeben? Warum?
    // Versuche, die Methode sumAndDifference() so umzuschreiben,
    // dass sie die spezifizierten Anforderungen erfüllt.
    // Wo stößt du auf Probleme? Kann man die Methode so einfach
    // fixen?

    //1

   /* public static void foo() {
        int a = 7;
        int b = 4;
        sumAndDifference(a, b);
        System.out.println("a == " + a);
        System.out.println("b == " + b);
    }*/

    public static void foo(){
        IntWrapper a= new IntWrapper(7);
        IntWrapper b= new IntWrapper(4);
        sumAndDifference(a, b);
        System.out.println("a == " + a);
        System.out.println("b == " + b);

    }

    /*public static void foo() {
        int a = 7;
        int b = 4;
        TwoInts ti= sumAndDifference(a, b);
        System.out.println("a == " + a);
        System.out.println("b == " + b);
    }*/

    //2



    // Schreibt die Summe von a und b in a und die Differenz in b (??)
    //public static void sumAndDifference(int a, int b) {
        //int tmp = a;
        //a = a + b;
        //b = b - tmp;
    //}

    public static void sumAndDifference(IntWrapper a, IntWrapper b) {
        int tmp= a.content;
        a.content += b.content;
        b.content= tmp - b.content;
    }

     /*public static TwoInts  sumAndDifference(int a, int b) {
        return new TwoInts(a+b, a-b);
    }*/

    //Otras clases

}
class IntWrapper {
    int content;
    public IntWrapper (int content) {
        this.content= content;
    }
    public String toString() {
        return "" + content;
    }
}
class TwoInts {
    int n1;
    int n2;
    public TwoInts(int n1, int n2) {
        this.n1= n1;
        this.n2= n2;
    }


}
