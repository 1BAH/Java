import Elements.Monitor;

public class Monoblock extends Basic {
    Monitor monitor;

    public Monoblock (int CoreNumber, double FrequencyInGHz, int RAMsizeInGB, double RAMfrequencyInGHz, String StorageType, int StorageSizeInGB, double DiagonalInInch, String TypeOfMatrix, String Resolution) {
        super("Monoblock", CoreNumber, FrequencyInGHz, RAMsizeInGB, RAMfrequencyInGHz, StorageType, StorageSizeInGB);
        this.monitor = new Monitor(DiagonalInInch, TypeOfMatrix, Resolution);
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
    }
}
