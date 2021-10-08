package Elements;

public class RAM {
    int size;
    double freq;

    public RAM (int RAMsizeInGB, double RAMfrequencyInGHz) {
        this.size = RAMsizeInGB;
        this.freq = RAMfrequencyInGHz;
    }

    public void SizeInfo() {
        System.out.print("Size of RAM>>> ");
        System.out.print(size);
        System.out.println(" GB");
    }

    public void FrequencyInfo() {
        System.out.print("Frequency>>> ");
        System.out.print(freq);
        System.out.println(" GHz");
    }
}
