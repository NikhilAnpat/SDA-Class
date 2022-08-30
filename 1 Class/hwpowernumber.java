import java.util.Scanner;
class hwpowernumber
{
    static int power(int base,int exponent)
    {
        int power=1;
        for(int i=1;i<=exponent;i++)
        power = power*base;
        return power;
    }
    public static void main(String[] args) 
    {
        int base,exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        base =sc.nextInt();
        
        System.out.print("Enter the exponent:");
        exponent =sc.nextInt();

        sc.close();
        int pow =power(base,exponent);
        System.out.println(base+"to the power"+exponent+"is:"+pow);
    }
}