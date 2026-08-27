import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int ele = arr[0];

        for(int i = 0; i < arr.length; i++) {

            int count = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > max) {
                max = count;
                ele = arr[i];
            }
        }

        System.out.print(ele + " " + max);
    }
}
