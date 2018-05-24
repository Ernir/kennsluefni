public class Schulze {

    public static int[][] floydWarshall(int[][] d, int n) {
        /*
        Útgáfa af Floyd-Warshall reikniritinu til nota í Schulze kosningakerfinu.

        Tekur inn tvívítt fylki d, þar sem d[i][j] er fjöldi kjósenda sem kýs
        frambjóðanda i fram yfir frambjóðanda j, ásamt fjölda frambjóðenda n.

        Skilar tvívíðu fylki p, þar sem p[i][j] er styrkur sterkasta vegs frá i til j.
         */
        int[][] p = new int[n][n];
        for (int i = 0; i < n; i++) { // Upphafsstilling fylkisins p
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (d[i][j] > d[j][i]) {
                        p[i][j] = d[i][j];
                    } else {
                        p[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    for (int k = 0; k < n; k++) {
                        if (i != k && j != k) {
                            // "veikasti hlekkurinn" uppfærður
                            p[j][k] = Math.max(p[j][k], Math.min(p[j][i], p[i][k])); 
                        }
                    }
                }
            }
        }
        return p;
    }


    public static void main(String[] args) {
        String[] votes = new In("votes.txt").readAllLines();
        int numCandidates = Integer.parseInt(votes[0]);

        // Hér þarf að skrifa kóða!
        // Mælt er með því að skrifa hjálparaðferðir.
    }
}
