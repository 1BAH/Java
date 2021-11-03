import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public static String generateName() {
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

    static class Reader implements Runnable {
        Note notebook;

        Reader(Note notes) {
            this.notebook = notes;
        }

        public void run() {
            lock.writeLock().lock();

            try {
                Long duration = (long) (Math.random() * 10000);
                System.out.println(Thread.currentThread().getName()
                        + "  Time Taken " + (duration / 1000) + " seconds.");
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                int index = (int) (Math.random() * notebook.getLength());
                notebook.readNote(index);
                lock.writeLock().unlock();
            }

        }
    }

    static class Writer implements Runnable {
        Note notebook;
        String note;

        Writer(Note notes, String note) {
            this.notebook = notes;
            this.note = note;
        }

        public void run() {
            lock.readLock().lock();

            try {
                Long duration = (long) (Math.random() * 10000);
                System.out.println(Thread.currentThread().getName()
                        + "  Time Taken " + (duration / 1000) + " seconds.");
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                int index = (int) (Math.random() * notebook.getLength());
                notebook.addNote(index, note);
                lock.readLock().unlock();
            }

        }
    }

    static class Deleter implements Runnable {
        Note notebook;

        Deleter (Note notes) {
            this.notebook = notes;
        }

        public void run() {
            lock.writeLock().lock();

            try {
                Long duration = (long) (Math.random() * 10000);
                System.out.println(Thread.currentThread().getName()
                        + "  Time Taken " + (duration / 1000) + " seconds.");
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                int index = (int) (Math.random() * notebook.getLength());
                notebook.removeNote(index);
                lock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Note notebook = new Note();

        Thread write = new Thread(new Writer(notebook, generateName()));
        write.setName("Writer");

        Thread read = new Thread(new Reader(notebook));
        read.setName("Reader");

        Thread delete = new Thread(new Deleter(notebook));
        delete.setName("Deleter");

        write.start();

        read.start();

        delete.start();
    }
}

