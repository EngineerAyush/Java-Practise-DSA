
public class Palindrome {

    public static boolean Check(String name) {
        int n = name.length();
        for (int i = 0; i < name.length() / 2; i++) {
            char char1 = Character.toLowerCase(name.charAt(i));
            char char2 = Character.toLowerCase(name.charAt(n - i - 1));
            if (char1 != char2) {
                return false;
            }
        }
        return true;
    }
    
public static void main(String[] args) {
    String str="AaayuyAaA";
    boolean a=Check(str);
    System.out.println(a);

}
    
}