
package tongsonguyenduongchan;
import java.util.Scanner;
public class Tongsonguyenduongchan {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        int S = 0;
        
        for (int i = 2; i <= n; i += 2) {
            S += i;
        }
        
        System.out.println("Tong chan = " + S);
    }

}
