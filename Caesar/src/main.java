public class main {
    public static String generateWord() {
        String word = "";
        int len = (int) ((Math.random() * 11) + 3);

        for (int i = 1; i <= len; i++) {
            word += Character.toString((char) ((int) (Math.random() * 26) + 97));
        }

        return word;
    }

    public static void main (String args[]) {
        int key = (int) ((Math.random() * 25) + 1);

        System.out.println("Key>>" + Integer.toString(key));

        CaesarCode Code = new CaesarCode(key);

        String randomString = generateWord();

        System.out.println(randomString);
        System.out.println(Code.encode(randomString));
        System.out.println(Code.decode(randomString));
    }
}
