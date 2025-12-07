import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first side of the parallelogram: ");
        double a = sc.nextDouble();
      
        System.out.println("Enter the second side of the parallelogram: ");
        double b = sc.nextDouble();
        
        System.out.println("Enter the angle between sides (in degrees): ");
        double degree = sc.nextDouble();
        
        if(a > 0 && b > 0 && degree > 0 && degree < 180) {
            double radians = Math.toRadians(degree);
            double sinAngle = Math.sin(radians);
            double area = a * b * sinAngle;
            System.out.println("Area of the parallelogram is: " + area);
        } else {
            System.out.println("Invalid input! Sides must be positive and angle must be between 0° and 180°.");
        }
        sc.close();
    }
}

