import edu.princeton.cs.algs4.*;

public class ScrabbleSearch {

    // Ef þið viljið nota hjálparaðferðir má skrifa þær hingað!

    public static void main(String[] args) {
        In in = new In("ospd.txt"); // Opening up the reference file
        String[] scrabbleWords = in.readAllLines();
        String[] words = StdIn.readAllLines(); // Reading words from StdIn for comparison

        // Hingað getur komið uppsetning á leitaraðferðunum og/eða tímamælingunum

        int linearSearchCount = 0;
        for (String word : words) {
            // Hér skal athuga með línulegri leit hve mörg orð sem lesin voru inn má finna í ospd.txt
        }
        // Hér má skrifa út tímann sem línulega leitin tók
        int binarySearchCount = 0;
        for (String word : words) {
            // Hér skal athuga með helmingunarleit hve mörg orð sem lesin voru inn má finna í ospd.txt
        }
        // Hér má skrifa út tímann sem helmingunarleitin tók

        // If these aren't the same value, our methods are off!
        if (linearSearchCount != binarySearchCount){
            throw new AssertionError("Counting methods do not agree!");
        }
        StdOut.println("The number of matching words is: " + linearSearchCount);
    }
}
