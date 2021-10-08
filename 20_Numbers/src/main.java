import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void printList (ArrayList<Integer> list) {
        for (Integer i: list) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> createList (String data) throws InputException {
        String[] arrayofstr = data.split(" ");
        if (arrayofstr.length != 20) {
            throw new InputException("You have entered >>" + Integer.toString(arrayofstr.length) + " elements. Expected >>20. You have entered >>\"" + data + "\"");
        }

        ArrayList<Integer> arrayofint = new ArrayList<>();
        for (String number: arrayofstr) {
            try {
                arrayofint.add(Integer.parseInt(number));
            } catch (NumberFormatException nfe) {
                throw new InputException("\"" + number + "\" is not an integer number. You have entered >>\"" + data + "\"");
            }
        }

        return arrayofint;
    }

    public static void main(String args[]) throws InputException {
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arrNot2Not3 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String strData = input.nextLine();
        try {
            ArrayList<Integer> intData = createList(strData);
            for (Integer num: intData) {
                if (num % 2 == 0) {
                    arr2.add(num);
                }
                if (num % 3 == 0) {
                    arr3.add(num);
                }
                if (!arr2.contains(num) && !arr3.contains(num)) {
                    arrNot2Not3.add(num);
                }
            }

            System.out.println("All numbers ⫶2");
            printList(arr2);
            System.out.println("All numbers ⫶3");
            printList(arr3);
            System.out.println("All number not ⫶2 and not ⫶3");
            printList(arrNot2Not3);
        } catch (InputException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
