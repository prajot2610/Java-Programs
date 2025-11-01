import java.util.*;

public class interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        
        int moves = 0;
        
        for (int i = 0; i < n; i++) {
            int a = s1.charAt(i) - '0';
            int b = s2.charAt(i) - '0';
            int c = Math.abs(a - b);
            if(c <= 5) {
                 moves = moves + c;
            }
            else{
                moves = moves + 10 - c;
            }
        }
        
        System.out.println(moves);
    }
}