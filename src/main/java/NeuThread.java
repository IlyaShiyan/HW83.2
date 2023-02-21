public class NeuThread extends Thread {

    private char a ;

    public NeuThread(char a) {
        this.a = a;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(a);
        }
    }
}
