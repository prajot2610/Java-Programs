import java.util.*;
class Demo
{
    String[] a;
    int b;
    Demo(String[] a, int b)
    {
        this.a = a.clone();
        this.b=b;

    }
}
public class ol4 {
    public static void main(String[] args) {
        Demo d = new Demo(args,3);
        for(String i: d.a)
        System.out.println(i);
    }
}
