public class p21
{
    int a;
    String b;
    static String c;
    public static void main(String arg[])
    {
        p21 a1 = new p21();
        p21 a2 = new p21();
        a1.a = 10;
        System.out.println(a1.a);
        a1.b = "Hello";
        System.out.println(a1.b);
        a1.c = "Hi";
        System.out.println(a2.c);
        a2.c = "Good";
        System.out.println(a2.c);
    }
}