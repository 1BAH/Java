import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class People {

    public static String generateFirstName() {
        String name = "";
        int len = (int) ((Math.random() * 11) + 3);
        String theName = "Egor";
        int equalName = (int) (Math.random() * 2);

        if (equalName == 0) {
            for (int i = 1; i <= len; i++) {
                if (i == 1) {
                    name += Character.toString((char) ((int) (Math.random() * 26) + 65));
                } else {
                    name += Character.toString((char) ((int) (Math.random() * 26) + 97));
                }
            }
        } else {
            name = theName;
        }

        return name;
    }

    public static String generateSecondName() {
        String name = "";
        int len = (int) ((Math.random() * 11) + 3);

        for (int i = 1; i <= len; i++) {
            if (i == 1) {
                name += Character.toString((char) ((int) (Math.random() * 26) + 65));
            } else {
                name += Character.toString((char) ((int) (Math.random() * 26) + 97));
            }
        }

        return name;
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> localData = new HashMap<>();

        for (int j = 0; j < 10; j++) {
            localData.put(generateSecondName(), generateFirstName());
        }

        return localData;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> names = new ArrayList<>(map.values());
        HashMap<String, Integer> counts = new HashMap<>();

        for (String str : names) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }

        HashSet<String> namesToRemove = new HashSet<>();

        for (String name: names) {
            if (counts.get(name) != 1) {
                for (String secondName: map.keySet()) {
                    if (map.get(secondName).equals(name)) {
                        namesToRemove.add(secondName);
                    }
                }

            }
        }

        for (String nameToRemove: namesToRemove) {
            removeItemFromMapByValue(map, nameToRemove);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        map.remove(value);
    }

    public static void printMap(HashMap<String,String> map) {
        System.out.println("================================");
        Set<String> keys = map.keySet();
        int number = 1;

        for (String firstName: keys) {
            System.out.print(Integer.toString(number) + ">>" + firstName + " ");
            System.out.println(map.get(firstName));
            number += 1;
        }
        System.out.println("================================");
    }

    public static void main(String[] args) {
        HashMap<String, String> d = createMap();
        printMap(d);
        removeTheFirstNameDuplicates(d);
        printMap(d);
    }
}
