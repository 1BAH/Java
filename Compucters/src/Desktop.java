import Elements.GraphicsCard;

public class Desktop extends Basic {
    GraphicsCard card;

    public Desktop (int CoreNumber, double FrequencyInGHz, int RAMsizeInGB, double RAMfrequencyInGHz, String StorageType, int StorageSizeInGB, int GraphicsCardSizeInGB) {
        super("Desktop", CoreNumber, FrequencyInGHz, RAMsizeInGB, RAMfrequencyInGHz, StorageType, StorageSizeInGB);
        this.card = new GraphicsCard(GraphicsCardSizeInGB);
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
        System.out.println(">>> GraphicsCard");
        card.SizeInfo();
    }
}
