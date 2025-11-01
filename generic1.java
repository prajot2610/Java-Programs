

import java.util.*;
class genericwild
{
    public static void adddata(List <? super Integer> l)
    {
        for(Integer n:l)
        System.out.println(n);
        l.add(5);
        l.add(90);
        l.add(65);
        for(Integer n:l)
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        List<Number> l1 = new ArrayList<>();
         List<Object> l2 = new ArrayList<>();
         adddata(l1);
         adddata(l2);
         System.out.println(l1);
         System.out.println(l2);
        
       
    }
}