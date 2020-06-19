public class WaNot {
    int i = 0;
    public static void main(String[] argv) {
        WaNot w = new WaNot();
        w.amethod();
    }

    public void amethod() {
        while(true) {
            try {
                wait();
            } catch (InterruptedException e) {}
            i++;
        }
    }
}