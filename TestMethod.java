import java.util.Scanner ; // tool
public class TestMethod
{
    static void nameMethod(String name) // 1st method
    {
        System.out.println("Your name is " + name );
    }
    static void calMethod(int num ) // 2nd method
    {
        int result = num + 3 ; 
        System.out.println("Your number is " + result);
        
    } 
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Your name : ");
        String name = x.nextLine();
        
        // between method 1 to 2
        System.out.print("Your number : ");
        int num = x.nextInt();
        // Inputs sended to method 1st and 2nd. 
        nameMethod(name);   // called method 1st
        calMethod(num);     // called method 2nd
        
    }
}