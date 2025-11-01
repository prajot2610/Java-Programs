import java.util.*;
class Demo{
    int a = 10;
    void abc(Demo op)
    {
        this.a = op.a+10;   // this.a is refering to parent class ; op is obejct which we have passed.
    }
}public class callbyreference {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.abc(d);
        System.out.println(d.a);
    }
}
