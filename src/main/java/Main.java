public class Main {
    public static void main(String[] args) throws InterruptedException {

        VariableCompartida vc = new VariableCompartida();

        Hebra h1 = new Hebra(vc);
        Hebra h2 = new Hebra(vc);

        h1.start();
        h2.start();

        h1.join();
        h2.join();

        System.out.println("Valor final de v: " + vc.get());

    }
}
