public class Hebra extends Thread {

    private VariableCompartidaFix variable;
    private boolean escribe;

    public Hebra(VariableCompartidaFix variable, boolean escribe) {
        this.variable = variable;
        this.escribe = escribe;
    }

    @Override
    public void run() {
        try {
            if (escribe) {
                for (int i = 0; i <= 99; i++) {
                    variable.set(i);
                }
            } else {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Valor leído: " + variable.get());
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}