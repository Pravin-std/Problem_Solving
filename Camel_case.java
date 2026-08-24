
import java.util.*;
public class lettersCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }else{
                System.out.println();
                System.out.print(Character.toLowerCase(ch));
            }
            
        }
    }
}
