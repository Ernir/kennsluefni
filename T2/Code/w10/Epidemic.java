import edu.princeton.cs.algs4.*;

public class Epidemic {

    private SymbolGraph sg;
    // Hér er kjörið að bæta við fleiri tilviksbreytum.

    public Epidemic(SymbolGraph sg) {
        // Hér þarf að upphafsstilla hermilíkanið.
        // Í þessari uppsetningu er gert ráð fyrir því að það eina sem líkanið þurfi sé tilvik af neti.
        // Þessum smið má breyta ef með þarf.
    }

    public void infect(String location) {
        // Þessi aðferð skal merkja staðinn "location" sem sýktan.
        // Velja þarf góða leið til að halda utan um hvaða staðir eru sýktir.
        // Ef location er þegar sýkt skal þessi aðferð ekki gera neitt.
    }

    public void infectNeighbors(String location) {
        // Lætur staðinn "location" sýkja alla nágranna sína.
        // Til þess að sýkja nágrannana er gott að kalla endurtekið á "infect" aðferðina að ofan.
        // Ef "location" er ekki sýkt til að byrja með skal þessi aðferð ekki gera neitt.
    }

    public String[] getInfected() {
        // Skilar strengjafylki af nöfnum allra staða sem eru sýktir.
        return null; // Breyta þessu
    }

    public boolean allInfected() {
        // Skilar sönnu ef allir staðir eru sýktir.
        return false; // Breyta þessu
    }


    public static void main(String[] args) {
        // Initialize a new SymbolGraph model on which to simulate an epidemic
        String filename = "routes.txt";
        String delim = " ";
        SymbolGraph sg = new SymbolGraph(filename, delim);
        Epidemic model = new Epidemic(sg);

        model.infect("JFK"); // Starts an epidemic in the "JFK" location
        String[] infected;
        while (!model.allInfected()) { // Spread the infection randomly until no healthy locations remain
            infected = model.getInfected();
            String nextOutbreak = infected[StdRandom.uniform(infected.length)];
            model.infectNeighbors(nextOutbreak);
            StdOut.println("Outbreak in " + nextOutbreak + "!");
            StdOut.println("Infected: " + String.join(", ", model.getInfected()));
        }
        StdOut.println("All is lost.");

    }
}
