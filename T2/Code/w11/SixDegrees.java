import edu.princeton.cs.algs4.*;

public class SixDegrees {

    private static Bag<String> getActorsFromLine(String line) {
        // Input:   String, with everything before the first slash representing a movie name, and the rest of the slash-
        //          separated line representing actor names
        // Returns: An String bag of the actors' names
        Bag<String> actorBag = new Bag<>();
        String[] splitLine = line.split("/");
        for (int i = 1; i < splitLine.length; i++) {
            actorBag.add(splitLine[i]);
        }
        return actorBag;
    }

    public static void main(String[] args) {
        /*
         * Eftirfarandi skref eru uppástunga að leið til að leysa verkefnið.
         */

        // 1. Lesa inn gögnin í movies.txt og vinna úr þeim nöfn leikaranna.
        //    Hver leikari getur leikið í meira en einni mynd. Varist endurtekningar!
        //    Mögulegt er að nota getActorsFromLine hjálparaðferðina eða kóða úr henni til að lesa leikaranöfn.

        // 2. Upphafsstilla net sem inniheldur gögnin.
        //    Þetta má gera á svipaðan hátt og í DegreesOfSeparation.java.

        // 3. Framkvæma leit að sérhverjum leikara, með Kevin Bacon sem ós.
        //    Fyrir hvern leikara þarf að telja fjölda leikara á milli Kevin Bacons og leikarans sjálfs,
        //    leikarinn meðtalinn. Athugið að telja ekki með myndirnar!

        // 4. Skrifa þarf út hversu oft hver Bacon-tala kom fyrir.
    }

}
