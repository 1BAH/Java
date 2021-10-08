import Elements.CPU;
import Elements.RAM;
import Elements.Storage;

public class Basic implements Interface {
    CPU cpu;
    RAM ram;
    Storage storage;
    String type;

    public Basic (String TypeOfDevice, int CoreNumber, double FrequencyInGHz, int RAMsizeInGB, double RAMfrequencyInGHz, String StorageType, int StorageSizeInGB) {
        this.type = TypeOfDevice;
        this.cpu = new CPU(CoreNumber, FrequencyInGHz);
        this.ram = new RAM(RAMsizeInGB, RAMfrequencyInGHz);
        this.storage = new Storage(StorageType, StorageSizeInGB);
    }

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
    }
}
