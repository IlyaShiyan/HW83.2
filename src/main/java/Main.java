public class Main {
    public static void main(String[] args) {

        NeuThread neuThread = new NeuThread('G');
        Thread thread = new Thread(neuThread);
        thread.start();
    }
}
