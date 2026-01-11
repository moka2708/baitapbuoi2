package kiemtrasonguyento;
import java.util.Scanner;
public class Kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int i = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                i++;
            }
        }
        if (i == 2) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " KHONG phai so nguyen to");
        }
    }
}

