package modelbaseddevelopment.adapter;
// Don't use the package name ducksimulator
public class UseBirdAdapters {
    public static void main(String[] args) {
        Duck turkey_in_disguise = new TurkeyAdapter(turkey);
        Turkey duck_in_disguise = new DuckAdapter(duck);

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe turkey adapter says...");
        testDuck(turkey_in_disguise);

        System.out.println("\nThe Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe Duck adapter says...");
        testTurkey(duck_in_disguise);

        Turkey duck_wanna_be = new DuckWannabe(duck);
        Duck turkey_wanna_be = new TurkeyWannabe(turkey);
        Turkey duck_wannabe_in_disguise = new DuckAdapter(duck_wanna_be);
        Duck turkey_wannabe_in_disguise = new TurkeyAdapter(turkey_wanna_be);

        System.out.println("\nThe Duck wannabe says...");
        testTurkey(duck_wanna_be);

        System.out.println("\nThe turkey wannabe says...");
        testDuck(turkey_wannabe_in_disguise);

        System.out.println("\nThe Duck wannabe adapter says...");
        testTurkey(duck_wannabe_in_disguise);

        System.out.println("\nThe Turkey wannabe adapter says...");
        testDuck(turkey_wanna_be);
    }
}
