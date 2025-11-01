public class ja {
    public static void main(String[] args) {
        int[][] arr = new int[Integer.parseInt(args[0])][]; // 2 rows
        for(int i=0;i<Integer.parseInt(args[0]);i++){
            arr[i] = new int[Integer.parseInt(args[i+1])]; // 2 columns
            int count =0;
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count++;
                for(int k=0;k<arr[i].length;k++){
                    System.out.print(arr[i][k] + " ");
                }
            }

        }
    }
}
