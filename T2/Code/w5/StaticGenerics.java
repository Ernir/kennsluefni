import edu.princeton.cs.algs4.StdOut;

public class StaticGenerics<T> {

    // Fjölnota tilviksaðferð
    private void doSomething(T tInstance) {
        StdOut.println(tInstance);
    }

    // Fjölnota klasaaðferð. Hér er T ekki það sama og skilgreint er fyrir klasann!
    private static <T> void doSomethingStatic(T tStatic) {
        StdOut.println(tStatic);
    }

    public static void main(String[] args) {
        // Setjum heiltölu í fjölnota tilviksaðferð
        new StaticGenerics<Integer>().doSomething(2);
        // Setjum streng
        doSomethingStatic("Þetta þarf ekki að vera sama tag og að ofan");
    }

}