public class ol2 {
    static void fun(String a, String b, float a1, float b1, int... n)
    {
        int sum = 0;
        for(int x:n)
        sum = sum + x;
        System.out.println(sum + " " + a);
    }
    public static void main(String[] args) {
        fun("Ravi" ,"Kishan", "4.5", "6.5",3, 4);
    }
}
