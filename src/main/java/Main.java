public class Main {
    public static void main(String[] args) throws InterruptedException {
        VariableCompartidaFix var = new VariableCompartidaFix();

        Hebra h1 = new Hebra(var, true);   // escribe 0..99
        Hebra h2 = new Hebra(var, false);  // lee 100 valores

        h1.start();
        h2.start();

        h1.join();
        h2.join();
    }
}