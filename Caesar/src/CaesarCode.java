import java.util.HashMap;
import java.util.Locale;

public class CaesarCode implements Coder {
    private int key;

    public CaesarCode (int key) {
        this.setKey(key);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String decode(String input) {
        HashMap<Character, Integer> alphabetLetters = new HashMap<>();
        alphabetLetters.put('a', 1);
        alphabetLetters.put('b', 2);
        alphabetLetters.put('c', 3);
        alphabetLetters.put('d', 4);
        alphabetLetters.put('e', 5);
        alphabetLetters.put('f', 6);
        alphabetLetters.put('g', 7);
        alphabetLetters.put('h', 8);
        alphabetLetters.put('i', 9);
        alphabetLetters.put('j', 10);
        alphabetLetters.put('k', 11);
        alphabetLetters.put('l', 12);
        alphabetLetters.put('m', 13);
        alphabetLetters.put('n', 14);
        alphabetLetters.put('o', 15);
        alphabetLetters.put('p', 16);
        alphabetLetters.put('q', 17);
        alphabetLetters.put('r', 18);
        alphabetLetters.put('s', 19);
        alphabetLetters.put('t', 20);
        alphabetLetters.put('u', 21);
        alphabetLetters.put('v', 22);
        alphabetLetters.put('w', 23);
        alphabetLetters.put('x', 24);
        alphabetLetters.put('y', 25);
        alphabetLetters.put('z', 26);

        HashMap<Integer, String> alphabetNumbers = new HashMap<>();
        alphabetNumbers.put(1, "a");
        alphabetNumbers.put(2, "b");
        alphabetNumbers.put(3, "c");
        alphabetNumbers.put(4, "d");
        alphabetNumbers.put(5, "e");
        alphabetNumbers.put(6, "f");
        alphabetNumbers.put(7, "g");
        alphabetNumbers.put(8, "h");
        alphabetNumbers.put(9, "i");
        alphabetNumbers.put(10, "j");
        alphabetNumbers.put(11, "k");
        alphabetNumbers.put(12, "l");
        alphabetNumbers.put(13, "m");
        alphabetNumbers.put(14, "n");
        alphabetNumbers.put(15, "o");
        alphabetNumbers.put(16, "p");
        alphabetNumbers.put(17, "q");
        alphabetNumbers.put(18, "r");
        alphabetNumbers.put(19, "s");
        alphabetNumbers.put(20, "t");
        alphabetNumbers.put(21, "u");
        alphabetNumbers.put(22, "v");
        alphabetNumbers.put(23, "w");
        alphabetNumbers.put(24, "x");
        alphabetNumbers.put(25, "y");
        alphabetNumbers.put(26, "z");

        char[] symbols = input.toLowerCase(Locale.ROOT).toCharArray();
        String output = "";
        
        for (char sym: symbols) {
            output += alphabetNumbers.get((alphabetLetters.get(sym) + key - 1) % 26 + 1);
        }

        return output;
    }

    @Override
    public String encode(String input) {
        HashMap<Character, Integer> alphabetLetters = new HashMap<>();
        alphabetLetters.put('a', 1);
        alphabetLetters.put('b', 2);
        alphabetLetters.put('c', 3);
        alphabetLetters.put('d', 4);
        alphabetLetters.put('e', 5);
        alphabetLetters.put('f', 6);
        alphabetLetters.put('g', 7);
        alphabetLetters.put('h', 8);
        alphabetLetters.put('i', 9);
        alphabetLetters.put('j', 10);
        alphabetLetters.put('k', 11);
        alphabetLetters.put('l', 12);
        alphabetLetters.put('m', 13);
        alphabetLetters.put('n', 14);
        alphabetLetters.put('o', 15);
        alphabetLetters.put('p', 16);
        alphabetLetters.put('q', 17);
        alphabetLetters.put('r', 18);
        alphabetLetters.put('s', 19);
        alphabetLetters.put('t', 20);
        alphabetLetters.put('u', 21);
        alphabetLetters.put('v', 22);
        alphabetLetters.put('w', 23);
        alphabetLetters.put('x', 24);
        alphabetLetters.put('y', 25);
        alphabetLetters.put('z', 26);

        HashMap<Integer, String> alphabetNumbers = new HashMap<>();
        alphabetNumbers.put(1, "a");
        alphabetNumbers.put(2, "b");
        alphabetNumbers.put(3, "c");
        alphabetNumbers.put(4, "d");
        alphabetNumbers.put(5, "e");
        alphabetNumbers.put(6, "f");
        alphabetNumbers.put(7, "g");
        alphabetNumbers.put(8, "h");
        alphabetNumbers.put(9, "i");
        alphabetNumbers.put(10, "j");
        alphabetNumbers.put(11, "k");
        alphabetNumbers.put(12, "l");
        alphabetNumbers.put(13, "m");
        alphabetNumbers.put(14, "n");
        alphabetNumbers.put(15, "o");
        alphabetNumbers.put(16, "p");
        alphabetNumbers.put(17, "q");
        alphabetNumbers.put(18, "r");
        alphabetNumbers.put(19, "s");
        alphabetNumbers.put(20, "t");
        alphabetNumbers.put(21, "u");
        alphabetNumbers.put(22, "v");
        alphabetNumbers.put(23, "w");
        alphabetNumbers.put(24, "x");
        alphabetNumbers.put(25, "y");
        alphabetNumbers.put(26, "z");

        char[] symbols = input.toLowerCase(Locale.ROOT).toCharArray();
        String output = "";

        for (char sym: symbols) {
            output += alphabetNumbers.get((26 + alphabetLetters.get(sym) - key - 1) % 26 + 1);
        }

        return output;
    }
}
