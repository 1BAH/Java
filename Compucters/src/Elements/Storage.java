package Elements;

public class Storage {
    String type;
    int size;

    public Storage (String StorageType, int StorageSizeInGB) {
        this.size = StorageSizeInGB;
        this.type = StorageType;
    }

    public void SizeInfo() {
        System.out.print("Size of RAM>>> ");
        System.out.print(size);
        System.out.println(" GB");
    }

    public void TypeInfo() {
        System.out.print("Type of storage>>> ");
        System.out.println(type);
    }
}
