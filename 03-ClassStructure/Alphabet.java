public class Alphabet {
    static boolean isAlphabet(String t)
    {
        for (int i = 0; i < t.length() - 1; i++) {
            char currentChar = Character.toLowerCase(t.charAt(i));
            char nextChar = Character.toLowerCase(t.charAt(i + 1));

            if (currentChar > nextChar) {
                return false; 
            }
        }

        return true; 
    }
    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
