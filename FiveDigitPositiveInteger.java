import java.util.Scanner;
public class FiveDigitPositiveInteger 
{
    
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int n, sum=0,k;
    
    System.out.println("Enter a 5 digit positive integer");
    n=sc.nextInt();
    
    while(n!=0)
    {
        k=n%10;
        n=n/10;
        sum=sum+k;
    }
    System.out.println("The sum of the digits is"+sum);
}
}
