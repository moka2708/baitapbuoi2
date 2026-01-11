
package tongsonguyenduongle;
import java.util.Scanner;
public class Tongsonguyenduongle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        long S = 0;
        int i = 1;
        while (i <= n) {
            S += i;
            i += 2; 
        }
        System.out.println("Tong cac so le = " + S);
    }

}
