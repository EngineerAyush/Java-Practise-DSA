import java.util.ArrayList;
import java.util.List;

class Practise {
    private void solve(String digit, String output, int index, List<String> ans, String[] map) {
        if (index >= digit.length()) {
            ans.add(output);
            return;
        }
        int num = digit.charAt(index) - '0';
        String value = map[num];
        for (int i = 0; i < value.length(); i++) {
            output += value.charAt(i);
            solve(digit, output, index + 1, ans, map);
            output = output.substring(0, output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String output = "";
        int index = 0;
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits, output, index, ans, mapping);
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        Practise obj = new Practise();
        List<String> result = obj.letterCombinations(digits);
        
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
