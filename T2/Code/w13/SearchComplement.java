import edu.princeton.cs.algs4.StdOut;

public class SearchComplement {

    public Iterable<Integer> searchComplement(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        assert (m < n);

        ???
    }

    public static void main(String[] args ){
        String text = "bananaranar";
        String pattern = "nana";

        for(int i : new SearchComplement().searchComplement(pattern, text)){
            StdOut.println(i);
        }
    }

}
