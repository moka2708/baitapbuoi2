
package tong1denndungfor;
import java.util.Scanner;
public class Tong1denndungfor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        int S = 0;
        for (int i = 1; i <= n; i++) {
            S += i;
        }
        
        System.out.println("Tong = " + S);
    }

}
