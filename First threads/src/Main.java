public class Main {
    public static class Extended extends Thread {
        @Override
        public void run() {
            System.out.println("This is extended thread.");
        }
    }

    public static void main (String[] args) {
        Thread ExtendedThread = new Extended();
        ExtendedThread.start();

        Runnable ToBeDone = new Runnable() {
            public void run() {
                System.out.println("This is runnable thread.");
            }
        };

        Thread RunnableThread = new Thread(ToBeDone);
        RunnableThread.start();
    }
}
