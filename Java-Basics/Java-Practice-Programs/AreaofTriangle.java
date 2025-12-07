import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a base of the Triangle: ");
        double base = sc.nextDouble();
      
        System.out.println("Enter a height of the Triangle: ");
        double height = sc.nextDouble();
        
        if(base > 0 && height >0)
        {
        double area = 0.5*height*base;
        System.out.println("Area of the Triangle is : " +area);
        }
        else {
            System.out.println("You have entered negative number");
        }
        sc.close();
    }
}