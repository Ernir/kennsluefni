import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

class Hanoi {
    /*
    Táknar eina ákveðna uppsetningu á Hanoi þrautinni.
    */

    private Stack<Integer> left;
    private Stack<Integer> middle;
    private Stack<Integer> right;
    private int n;

    public Hanoi(int n) {
        /*
        Upphafsstillir þrautina með n skífum.
         */
        this.n = n;
        this.left = new Stack<>();
        this.middle = new Stack<>();
        this.right = new Stack<>();

        for (int i = n; 0 < i; i--) {
            this.left.push(i);
        }
        this.displayState();
    }

    public void solve() {
        /*
        Skrifar út lausn á þrautinni, eitt skref í einu.
        */
        // Hér þarf að skrifa kóða
    }

    private void displayState() {
        StdOut.println("Vinstri : " +  this.left.toString());
        StdOut.println("Miðja   : " +  this.middle.toString());
        StdOut.println("Hægri   : " + this.right.toString());
        StdOut.println("#####################");
    }

    public static void main(String[] args) {
        new Hanoi(3).solve();
    }

}