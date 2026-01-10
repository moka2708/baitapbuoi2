
package tongsonguyenduongle;
import java.util.Scanner;
public class Tongsonguyenduongle {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        long tong = 0;
        int i = 1; // Bắt đầu từ số lẻ đầu tiên

        while (i <= n) {
            tong += i;
            i += 2; // Tăng thêm 2 để nhảy sang số lẻ tiếp theo (1 -> 3 -> 5...)
        }

        System.out.println("Tong cac so le = " + tong);
    }
}