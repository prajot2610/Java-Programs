import java.util.Scanner;
public class arrayprogram {
    public static void main(String[] agrs)
    {
        int[] arr = new int[Integer.parseInt(agrs[0])];
        Scanner sc = new Scanner(System.in);   //java.util.Sacnner sc =new  java.util.Scanner(System.in); you can write this also 
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}