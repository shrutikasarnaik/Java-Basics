import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start : ");
        int start = sc.nextInt();

        System.out.print("Enter end : ");
        int end = sc.nextInt();

        for(int n = start; n <= end; n++){
            int sum = 0, temp = n;

            while(temp > 0){
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }

            if(sum == n){
                System.out.println(n);
            }
        }
    }
}
