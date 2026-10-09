public class Hebra extends Thread {

    private VariableCompartida variable;

    public Hebra(VariableCompartida variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            variable.inc();
        }
    }
}