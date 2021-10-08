public interface Interface {
    public void Info();

    default void On() {
        System.out.println("========================================================");
        System.out.println(">>>>>>>> You successfully turned your device on. <<<<<<<");
        System.out.println("========================================================");
        this.Info();
        System.out.println("--------------------------------------------------------");
        System.out.println("Your device is working...");
    }

    default void Off() {
        System.out.println("========================================================");
        System.out.println(">>>>>>> You successfully turned your device off. <<<<<<<");
        System.out.println("========================================================");
        this.Info();
        System.out.println("--------------------------------------------------------");
        System.out.println("Your device stopped working.");
    }

    default void ConnectToInternet() {
        System.out.println("========================================================");
        System.out.println(">> You successfully connected your device to Internet.<<");
        System.out.println("========================================================");
        this.Info();
        System.out.println("--------------------------------------------------------");
        System.out.println("Your device is connected to the Internet...");
    }
}
