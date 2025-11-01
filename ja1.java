import java.util.Arrays;
public class ja1 {
    public static void main(String[] args) {
        int [][] arr1= {{1,2} , {3,4}}; // 2 rows
        int [][] arr2 ={{1,2}, {3,4}}; // 2 rows
        System.out.println(Arrays.deepEquals(arr1, arr2));     // 2d and above array comparison use deepEquals and 1d array use array.equals


    }
}
