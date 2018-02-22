import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class SortVisualizerW7 {

    private static Integer min = 0, max = 0;

    private static void initialize(Integer[] a) {
        /*
        Upphafsstillir teiknisvæði fyrir fylkið <a>
         */

        for (Integer i : a) { // Finnum útgildi lóðrétta hnitakerfisássins
            if (i < min) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        StdDraw.setXscale(0, a.length);
        StdDraw.setYscale(min, max);
        StdDraw.setPenRadius(.01);
        StdDraw.setPenColor(StdDraw.BLACK);
    }

    public static void visualize(Integer[] a, Integer highlightStart, Integer highlightEnd) {
        /*
        Teiknar upp heiltölufylkið <a> sem safn af súlum,
        leggur áherslu á punkta númer <highlightStart> til <highlightEnd> (báðir meðtaldir)
         */
        if (min == 0 && max == 0) {
            initialize(a);
        }
        StdDraw.clear();
        for (int i = 0; i < a.length; i++) {
            if (i == highlightStart) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            StdDraw.filledRectangle(i, a[i]/2.0, 0.5, a[i]/2.0);
            if (i == highlightEnd) {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        Integer[] a = new Integer[n];
        for (Integer i = 0; i < n; i++) {
            a[i] = i;
        }
        StdRandom.shuffle(a);
        visualize(a, -1, n);
    }
}

