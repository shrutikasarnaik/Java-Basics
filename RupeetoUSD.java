import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees : ");
        float inr = sc.nextFloat();

        float usd = inr / 83;
        System.out.println("USD = " + usd);
    }
}
