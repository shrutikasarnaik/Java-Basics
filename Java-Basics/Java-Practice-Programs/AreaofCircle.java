import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle : ");
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area of circle is : " +area);
        sc.close;
    }
}