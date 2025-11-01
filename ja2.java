import java.util.*;
public class ja2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int[] arr = new int[sc.nextInt()]; // 2 rows
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
            Arrays.sort(arr);
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j] + " ");
                System.out.println();
                System.out.println("Enter the key");
                int key = sc.nextInt();
                System.out.println("key found at index : " + Arrays.binarySearch(arr, key));
            }
       }
}

