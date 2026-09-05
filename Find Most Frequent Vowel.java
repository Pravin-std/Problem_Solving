import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] count = new int[256];

        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        char maxChar = s.charAt(0);

        for (char ch : s.toCharArray()) {
            if (count[ch] > count[maxChar]) {
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
    }
}
