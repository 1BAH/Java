public class main {
    public static void main(String args[]) {
        MyArrayList arr = new MyArrayList();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        System.out.println(arr.remove(3));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(Integer.toString(arr.get(i)) + " ");
        }

        System.out.println(' ');
        System.out.print(arr.size());
    }
}
