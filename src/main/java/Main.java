public class Main {
    public static void main(String[] args) {

        int i = 5;

        NeuThread neuThread = new NeuThread(i);

        Thread thread1 = new Thread(neuThread);
        Thread thread2 = new Thread(neuThread);
        Thread thread3 = new Thread(neuThread);
        Thread thread4 = new Thread(neuThread);
        Thread thread5 = new Thread(neuThread);
        Thread thread6 = new Thread(neuThread);
        Thread thread7 = new Thread(neuThread);
        Thread thread8 = new Thread(neuThread);
        Thread thread9 = new Thread(neuThread);
        Thread thread10 = new Thread(neuThread);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();


    }
}
