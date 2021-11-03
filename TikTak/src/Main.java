import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        MyClock Clock = new MyClock();
        Clock.start();

        try {
            TimeUnit.SECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Clock.finish();
    }
}
