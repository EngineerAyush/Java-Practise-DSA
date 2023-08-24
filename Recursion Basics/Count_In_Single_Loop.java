public class Count_In_Single_Loop{
    public static void countChars(String str) {
        int[] count = new int[256];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                if (count[i] > 0) {
                    System.out.println((char) i + ": " + count[i]);
                }
            }
        }
    public static void main(String[] args) {
        countChars("abeccdddffaaw");
    }
}