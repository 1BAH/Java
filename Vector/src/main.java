import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("=== Ввод данных по первому вектору ===");
        System.out.println("======================================");
        System.out.print("Введите координату x >>> ");
        int x1 = input.nextInt();
        System.out.print("Введите координату y >>> ");
        int y1 = input.nextInt();
        System.out.print("Введите координату z >>> ");
        int z1 = input.nextInt();
        System.out.println("======================================");

        System.out.println("ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ");

        System.out.println("======================================");
        System.out.println("=== Ввод данных по второму вектору ===");
        System.out.println("======================================");
        System.out.print("Введите координату x >>> ");
        int x2 = input.nextInt();
        System.out.print("Введите координату y >>> ");
        int y2 = input.nextInt();
        System.out.print("Введите координату z >>> ");
        int z2 = input.nextInt();
        System.out.println("======================================");

        Vector v1 = new Vector(x1,y1,z1);
        Vector v2 = new Vector(x2,y2,z2);

        System.out.println("ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ");

        System.out.println("======================================");
        System.out.println("=========== Длины векторов ===========");
        System.out.println("======================================");
        System.out.print("Длина первого вектора >>> ");
        System.out.println(v1.length());
        System.out.print("Длина второго вектора >>> ");
        System.out.println(v2.length());
        System.out.println("======================================");

        System.out.println("ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ");

        System.out.println("======================================");
        System.out.println("======== Произведения векторов =======");
        System.out.println("======================================");
        System.out.print("Скалярное произведение >>> ");
        System.out.println(v1.scalarProduct(v2));
        System.out.println("");
        System.out.print("Векторное произведение >>> ");
        System.out.println(v1.crossProduct(v2));
        System.out.print("Координата x >>> ");
        System.out.println(v1.crossProduct(v2).x);
        System.out.print("Координата y >>> ");
        System.out.println(v1.crossProduct(v2).y);
        System.out.print("Координата z >>> ");
        System.out.println(v1.crossProduct(v2).z);
        System.out.println("======================================");

        System.out.println("ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ");

        System.out.println("======================================");
        System.out.println("======== Сложение векторов =======");
        System.out.println("======================================");
        System.out.print("Сумма >>> ");
        System.out.println(v1.add(v2));
        System.out.print("Координата x >>> ");
        System.out.println(v1.add(v2).x);
        System.out.print("Координата y >>> ");
        System.out.println(v1.add(v2).y);
        System.out.print("Координата z >>> ");
        System.out.println(v1.add(v2).z);
        System.out.println("");
        System.out.print("Разность >>> ");
        System.out.println(v1.subtract(v2));
        System.out.print("Координата x >>> ");
        System.out.println(v1.subtract(v2).x);
        System.out.print("Координата y >>> ");
        System.out.println(v1.subtract(v2).y);
        System.out.print("Координата z >>> ");
        System.out.println(v1.subtract(v2).z);
        System.out.println("======================================");

        System.out.println("ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ");

        System.out.println("======================================");
        System.out.println("======== Угол между векторами ========");
        System.out.println("======================================");
        System.out.print("Косинус угла >>> ");
        System.out.println(v1.cos(v2));
        System.out.println("======================================");
    }


}
