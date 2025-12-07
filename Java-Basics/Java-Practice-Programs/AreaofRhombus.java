import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first diagonal : ");
        double d1 = sc.nextDouble();
      
        System.out.println("Enter the second  diagonal : ");
        double d2 = sc.nextDouble();
        
        if(d1 > 0 && d2 > 0  ) {
            double area=(d1*d2)/2;
            System.out.println("Area of the rhombus: " + area);
        } else {
            System.out.println("Invalid input! diagonal must be positive");
        }
        sc.close();
    }
}

