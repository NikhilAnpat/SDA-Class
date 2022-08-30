import java.util.Scanner;
public class compoundintrest 
{
    public static void main(String args[])
{
    double principle,rate,time,compound_intrest;
    System.out.println("Required package have been imported");
    Scanner my_Scanner = new Scanner(System.in);
    System.out.println("A Scanner object has been defined");

    System.out.print("Enter a principle number :");
    principle = my_Scanner.nextInt();

    System.out.print("Enter the intrest rate :");
    rate = my_Scanner.nextInt();
    
    System.out.print("Enter the time period in year:");
    time =my_Scanner.nextInt();

    compound_intrest = principle *(Math.pow((1 + rate / 100),time))-principle;
    System.out.println("The compound intrest is :" + compound_intrest);
}
}
