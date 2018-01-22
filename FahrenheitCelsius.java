import java.util.Scanner;
public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        int choice = scan.nextInt();
        
        double temperature= 0.0;
        double converted= 0.0;
        
        if(choice==1)
        {
            System.out.println("Enter the temperature in Celsius.");
            temperature = scan.nextDouble();
            converted = 9/5.0*temperature+32;
            System.out.println("Temperature in Fahrenheit= "+converted);
        }
        else if(choice==2)
        {
            System.out.println("Enter the temperature in Fahrenheit.");
            temperature = scan.nextDouble();
            converted = 5/9.0*(temperature-32);
            System.out.println("wrong Input. Please try again.");
       }
    }
    
}
