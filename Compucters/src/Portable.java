import Elements.Monitor;

public class Portable extends Basic {
    Monitor monitor;
    String keyboard;

    public Portable (String TypeOfDevice, int CoreNumber, double FrequencyInGHz, int RAMsizeInGB, double RAMfrequencyInGHz, String StorageType, int StorageSizeInGB, double DiagonalInInch, String TypeOfMatrix, String Resolution, String Keyboard) {
        super(TypeOfDevice, CoreNumber, FrequencyInGHz, RAMsizeInGB, RAMfrequencyInGHz, StorageType, StorageSizeInGB);
        this.monitor = new Monitor(DiagonalInInch, TypeOfMatrix, Resolution);
        this.keyboard = Keyboard;
    }

    @Override
    public void Info() {
        System.out.println("Your device info:");
        System.out.print("Type>>> ");
        System.out.println(this.type);
        System.out.println(">>> CPU");
        cpu.CoreInfo();
        cpu.FrequencyInfo();
        System.out.println(">>> RAM");
        ram.SizeInfo();
        ram.FrequencyInfo();
        System.out.println(">>> Storage");
        storage.TypeInfo();
        storage.SizeInfo();
        System.out.println(">>> Monitor");
        monitor.DiagonalInfo();
        monitor.TypeInfo();
        monitor.ResolutionInfo();
        System.out.println(">>> Keyboard");
        System.out.print("Keyboard>>> ");
        System.out.println(this.keyboard);
    }
}
