import java.util.Scanner;

public class Car 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double totalDistance = 0;
        double totalGas = 0;
        double maxDistance = 0;
        double totalGasCost = 0;
        double count = 0;

        System.out.println("Please enter your car's distance in km and fuel on lt.");
        System.out.print("Enter how many cars you want to check: ");
        count = scanner.nextDouble();
        
        while (count != 0) 
        {
            
            if (count == 0) 
            {
                break;
            }
            System.out.println("------------------------------------------");
            System.out.print("Enter km: ");
            double distance = scanner.nextDouble();
            totalDistance += distance;
            totalGas += (distance / 100) * 6.3; 
            if (distance > maxDistance) 
            {
                maxDistance = distance;
            }
                System.out.print("Enter the cost of fuel: ");
                double cost = scanner.nextDouble();
                totalGasCost = totalGas * cost;
                System.out.print("Enter how much lt/100km: ");
                double lt = scanner.nextDouble();
                totalGas += (distance / 100) * lt; 
                count--;
                
        }

       
        System.out.println("------------------------------------------");
        System.out.println("Total Distance: " + totalDistance + "km");
        System.out.println("Total Fuel Consumption: " + totalGas + "L");
        System.out.println("Max km: " + maxDistance + "km");
        System.out.println("Total Fuel Cost: " + totalGasCost + "$");
        System.out.println("------------------------------------------");

        scanner.close();
    }
}
