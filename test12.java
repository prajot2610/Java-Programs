// You are using Java
import java.util.*;
class test12
{
    public static void main(String[] arg)
    {
        LinkedList<String> l = new LinkedList<String>();
        l.add("one");
        l.add("two");   
        l.add("three");
        System.out.println(l);
        l.add(1,"Six");
        System.out.println(l);
         LinkedList<String> l2 = new LinkedList<String>();
         l2.add("10");
         l2.add("20");
         l.addAll(l2);
         System.out.println(l);
    }
}