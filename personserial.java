class person implements Serializable
{
    int id;
    String name;
    person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
class Student extends person
{
    int fee;
    String course;
    public Student(int id, String name, int fee, String course)
    {
        super(id, name);
        this.fee = fee;
        this.course = course;
    }
}
public class serialtest
{
    public static void main(String[] args)
    {
        Student s1 = new Student(12, "Rahul", 50000, "BCA");
        FileOutputStream fout = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.close();
        fout.close();
       
        FileInputStream in = new FileInputStream(new FileInputStream("student.txt"));   //lambda expressio
        Student s =(Student)in.readObject();
        in.close();
        in.flush();
    }
}