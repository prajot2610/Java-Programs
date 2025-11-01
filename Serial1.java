public class serial implements Serializable
{
    static int  x= 10;
    public static void main(String args[])
    {
       serialtest s1 = new serialtest();
       System.out.println("Before Serialization:"+ x);
       FileOutputStream fout = new FileOutputStream("file.txt");
         ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            x=20;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            serialtest s = (serialtest)in.readObject();
            System.out.println("After Serialization:"+ s.x);
            in.close();
    }
}