package Elements;

public class CPU {
    int core;
    double freq;

    public CPU (int CoreNumber, double FrequencyInGHz) {
        this.core = CoreNumber;
        this.freq = FrequencyInGHz;
    }

    public void CoreInfo() {
        System.out.print("Number of cores>>> ");
        System.out.println(core);
    }

    public void FrequencyInfo() {
        System.out.print("Frequency>>> ");
        System.out.print(freq);
        System.out.println(" GHz");
    }
}
