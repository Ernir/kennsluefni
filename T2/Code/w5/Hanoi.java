import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

class Hanoi {

    private Stack<Integer> left;
    private Stack<Integer> middle;
    private Stack<Integer> right;

    public Hanoi(int n) {
        /*
        Creates a new instance of the Hanoi puzzle, with n disks.
         */
        this.left = new Stack<>();
        this.middle = new Stack<>();
        this.right = new Stack<>();

        for (int i = n; 0 < i; i--) {
            this.left.push(i);
        }
        this.displayState();

        // Kalla á Solve aðferðina hérna!
    }

    /*
    ??? solve (???) {
        // Aðferð sem færir skífur á milli hlaðanna þar til upphaflegi hlaðinn er tómur og
        // annar hlaði inniheldur allar skífurnar, í smækkandi röð.
        // Eftir hverja tilfærslu skal kalla á displayState() aðferðina.
    }
    */

    private void displayState() {
        StdOut.println("Left stack:   " +  this.left.toString());
        StdOut.println("Middle stack: " +  this.middle.toString());
        StdOut.println("Right stack:  " + this.right.toString());
        StdOut.println("#####################");
    }


    public static void main(String[] args) {
        new Hanoi(4);
    }

}