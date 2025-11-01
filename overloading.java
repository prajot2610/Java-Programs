import java.util.*;
public class overloading {
    void fun(int n)
    {
        System.out.println(n);
    }
    void fun(int n, int n1)
    {
        System.out.println(n + n1);
    }
    void fun(int n, int n1, int n2)
    {
        System.out.println(n + n1 + n2);
    }
    public static void main(String[] args) {
     overloading demo = new overloading();
        demo.fun(3,4);
    }
}
