public class  serialtest <T, A>
{
    private T t;
    private A b;
    public void add(T t, A b) 
    {
        this.t = t;
        this.b = b;
    }
    public T get() 
    {
        return t;
    }
    public A get1() 
    {
        return b;
    }
    public static void main(String[] args) 
    {
        serialtest <Float, Integer> s = new serialtest<>();
        s.add(10.55f, 20);
        System.out.println("Value of t: " + s.get());
        System.out.println("Value of b: " + s.get1());
        serialtest <String, Double> s1 = new serialtest<>();
        s1.add("Hello", 20.55);
        System.out.println("Value of t: " + s1.get());
        System.out.println("Value of b: " + s1.get1());
    }
}