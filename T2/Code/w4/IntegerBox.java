import edu.princeton.cs.algs4.StdOut;

public class IntegerBox {
    /* 
    Okkar eigin klasi til að pakka inn heiltölum! 
    Hvert tilvik af klasanum inniheldur eina "int" tölu.
    */

    private int data;

    public IntegerBox() {
        // Býr til kassa með sjálfgefnu gildi
        this.data = 0;
    }

    public IntegerBox(int data) {
        // Býr til kassa sem inniheldur tölu
        this.data = data;
    }

    public int get() {
        return this.data;
    }

    public void set(int newValue) {
        this.data = newValue;
    }

    public void increment() {
        this.data++;
    }

    public static void main(String[] args) {
        IntegerBox box1 = new IntegerBox(5); // Setjum töluna 5 í kassa 1
        box1.increment();                    // Hækkum töluna í kassa 1 upp í 6
        IntegerBox box2 = box1;              // Afritum *vísunina* í kassa 1
        box2.increment();                    // Hækkum töluna í kassa 2 upp í 7
        StdOut.println(box2.get());          // Skrifar út töluna 7
        StdOut.println(box1.get());          // ???
    }
}
