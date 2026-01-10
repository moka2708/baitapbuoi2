package tong1denn;
import java.util.Scanner;
public class Tong1denn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        int tong = 0;
        int i = 1;
        
        while (i <= n) {
            tong += i;
            i++;
        }
        
        System.out.println("Tong = " + tong);
    }
}