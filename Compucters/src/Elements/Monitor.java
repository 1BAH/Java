package Elements;

public class Monitor {
    double dia;
    String type;
    String resolution;

    public Monitor (double DiagonalInInch, String TypeOfMatrix, String Resolution) {
        this.dia = DiagonalInInch;
        this.type = TypeOfMatrix;
        this.resolution = Resolution;
    }

    public void TypeInfo() {
        System.out.print("Type of matrix>>> ");
        System.out.println(type);
    }

    public void DiagonalInfo() {
        System.out.print("Diagonal>>> ");
        System.out.print(dia);
        System.out.println("\"");
    }

    public void ResolutionInfo() {
        System.out.print("Resolution>>> ");
        System.out.println(resolution);
    }
}
