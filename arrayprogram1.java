
public class arrayprogram1 {
    public static void main(String[] agrs)
    {
        int[] arr = java.util.stream.IntStream.rangeClosed(1,5).toArray();
       //java.util.Sacnner sc =new  java.util.Scanner(System.in); you can write this also 
    
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}