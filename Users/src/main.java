import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static String generateName() {
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

    public static HashSet<User> createUser() {
        HashSet<User> users = new HashSet<>();

        for (int j = 0; j < 10; j++) {
            int age = (int) ((Math.random() * 9) + 20);
            users.add(new User(generateName(), generateName(), age));
        }

        return users;
    }

    public static HashMap<Integer, ArrayList<User>> processMap (HashSet<User> data) {
        ArrayList<Integer> ageData = new ArrayList<>();

        for (User user: data) {
            ageData.add(user.getAge());
        }

        HashSet<Integer> ageSet = new HashSet<>(ageData);
        HashMap<Integer, ArrayList<User>> output = new HashMap<>();

        for (Integer age: ageSet) {
            for (User user: data) {
                if (user.getAge().equals(age)) {
                    if (output.containsKey(age)) {
                        ArrayList<User> addUser = new ArrayList<>(output.get(age));
                        addUser.add(user);
                        output.remove(age);
                        output.put(age, addUser);
                    } else {
                        ArrayList<User> addUser = new ArrayList<>();
                        addUser.add(user);
                        output.put(age, addUser);
                    }
                }
            }
        }

        return output;
    }

    public static void printUserMap(HashMap<Integer, ArrayList<User>> map) {
        for (Integer age: map.keySet()) {
            System.out.print(Integer.toString(age) + ": ");
            for (User user: map.get(age)) {
                System.out.print(user.getFirstName() + " ");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        printUserMap(processMap(createUser()));
    }
}
