package baitapxeploai; 
import java.util.Scanner;

public class Baitapxeploai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- XEP LOAI HOC LUC ---");

        System.out.print("Nhap diem tong ket (0 - 10): ");
        double diem = scanner.nextDouble();
        if (diem < 0 || diem > 10) {
            System.out.println("LOI: Diem phai nam trong khoang tu 0 den 10!");
        } else {
                    
            if (diem >= 9) {

                System.out.println("Ket qua: Xep loai GIOI");
            } else if (diem >= 7) {
     
                System.out.println("Ket qua: Xep loai KHA");
            } else if (diem >= 5) {
             
                System.out.println("Ket qua: Xep loai TRUNG BINH");
            } else {
            
                System.out.println("Ket qua: Xep loai YEU");
            }
        }

        scanner.close();
    }
}