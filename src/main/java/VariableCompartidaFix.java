public class VariableCompartidaFix {
    private int v = 0;
    private boolean disponible = false;

    public synchronized void set(int valor) throws InterruptedException {
        while (disponible) {
            wait();
        }
        this.v = valor;
        disponible = true;
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (!disponible) {
            wait();
        }
        disponible = false;
        notifyAll();
        return v;
    }
}
