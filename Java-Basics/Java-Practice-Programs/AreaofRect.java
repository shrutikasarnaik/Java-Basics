import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a bredth of the rectriangle: ");
        double breadth = sc.nextDouble();
      
        System.out.println("Enter a length of the rectriangle: ");
        double length = sc.nextDouble();
        
        if(breadth > 0 && length >0)
        {
        double area = breadth*length;
        System.out.println("Area of the Rectriangle is : " +area);
        }
        else {
            System.out.println("You have entered negative number");
        }
        sc.close();
    }
}