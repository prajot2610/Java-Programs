public class interest 
{
    public static void main(String[] arg) {
    float  principal = 500.00f; // in percent
    float roi = 12.5f;
    float Time = 20.5f;
    int i= (int)(principal * roi * Time )/ 100;
    
        System.out.println(i);

    }
}
