import java.util.Scanner;
public class code9 {
    public static void main(String [] args)
    {
        String ss = null;
        String FName = null;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            ss =sc.next();
            FName = sc.next();
            System.out.println(ss+FName);
        }

    }
}
