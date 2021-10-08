package Elements;

public class GraphicsCard {
    int size;

    public GraphicsCard (int CardSizeInGB) {
        this.size = CardSizeInGB;
    }

    public void SizeInfo() {
        System.out.print("Size of RAM>>> ");
        System.out.print(size);
        System.out.println(" GB");
    }
}
