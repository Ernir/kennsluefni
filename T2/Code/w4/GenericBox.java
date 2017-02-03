import edu.princeton.cs.algs4.StdOut;

public class GenericBox<T> {
    private T contents;

    public void set(T contents) {
        this.contents = contents;
    }

    public T get() {
        return contents;
    }

    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.set("Box contents!");
        StdOut.println(box.get());

        GenericBox<Integer> anotherBox = new GenericBox<Integer>();
        //anotherBox.set("More box contents!"); Tögunarvilla!
    }
}
