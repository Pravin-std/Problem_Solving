import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();

        if (arr[0] <= arr[size - 1]) {
            System.out.println("Invalid");
            return;
        }

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
