public class MyClock extends Thread {
    public boolean isActive = true;

    @Override
    public void run() {
        int message = 1;

        while (isActive) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }

            if (message == 1) {
                System.out.println("Tik");
                message = 0;
            } else {
                System.out.println("Tak");
                message = 1;
            }
        }
    }

    public void finish() {
        this.isActive = false;
    }
}
