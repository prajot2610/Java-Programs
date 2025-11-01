import java.util.*;
public class arrayprogram3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a[] = new int [sc.nextInt()];
       for(int i=0; i<a.length; i++)
        a[i] = sc.nextInt();
       int b[] = new int [sc.nextInt()];
       b=a.clone();
       a[3] = 21;
       for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
    }
}
