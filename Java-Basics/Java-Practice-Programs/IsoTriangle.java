import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a two equal sides of the triangle: ");
        double a = sc.nextDouble();
      
        System.out.println("Enter a base of the triangle: ");
        double b = sc.nextDouble();
        
        if(a > 0 && b >0)
        {
        double sq_root=Math.sqrt(4*a*a-b*b);
        double area = b/4*sq_root;
        
        System.out.println("Area of the triangle is : " +area);
        }
        else {
            System.out.println("You have entered negative number");
        }
        sc.close();
    }
}