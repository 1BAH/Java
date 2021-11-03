import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public static String generateString() {
        String name = "";
        int len = (int) ((Math.random() * 11) + 3);

        for (int i = 1; i <= len; i++) {
            if (i == 1) {
                name += Character.toString((char) ((int) (Math.random() * 26) + 65));
            } else {
                name += Character.toString((char) ((int) (Math.random() * 26) + 97));
            }
        }

        return name;
    }

    static class Creator implements Runnable {
        SingletonTask singleton;

        public void run() {
            lock.writeLock().lock();
            try {
                Long duration = (long) (Math.random() * 5000);
                System.out.println(Thread.currentThread().getName() + "  Time Taken " + (duration / 1000) + " seconds.");
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(singleton.getInstance(generateString()));
                lock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Creator());
        thread1.setName("Creator1");

        thread1.start();
    }
}
