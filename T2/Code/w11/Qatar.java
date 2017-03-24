import edu.princeton.cs.algs4.*;

public class Qatar {

    // Constants defining map boundaries for the qatar dataset
    private static int xMin = 50766;
    private static int xMax = 51619;
    private static int yMin = 24748;
    private static int yMax = 26150;

    private static void drawPoints(Point2D[] qatarPoints) {
        // Draws the points with coordinates given by qatarPoints within
        // the boundaries defined by the constants above.
        StdDraw.setCanvasSize(xMax - xMin, yMax - yMin);
        StdDraw.setXscale(0, xMax - xMin);
        StdDraw.setYscale(0, yMax - yMin);
        StdDraw.setPenRadius(0.01);

        for (Point2D p : qatarPoints) {
            StdDraw.point(p.x() - xMin, p.y() - yMin);
        }
    }

    private static void drawMST() {
        // Þessa aðferð þarf að klára. Bæta þarf við inntaksbreytum, líklega einni sem táknar
        // safn af punktum og annarri sem táknar spanntré.

        // Sem stendur teiknar hún bara kross til að sýna hvernig línuteiknifallið virkar.

        StdDraw.setXscale(0, 200);
        StdDraw.setYscale(0, 200);
        StdDraw.setPenRadius(0.01);

        StdDraw.line(100, 100, 200, 200);
        StdDraw.line(100, 200, 200, 100);
    }

    public static void main(String[] args) {
        String[] lines = new In("qatar.txt").readAllLines();
        Point2D[] points = new Point2D[lines.length];

        // Hér er búið að lesa inn skrána og búa til fylki af hentugum Point2D tilvikum úr algs4.jar.
        // Nú á eftir að mynda evklíðskt net sem táknar punktana, reikna í því léttasta spanntré,
        // kalla á teiknifallið drawMST og skrifa út

        // Ábending: Point2D klasinn er með aðferðina distanceTo. Smiður klasans tekur inn x-hnit og y-hnit.

    }
}
