package ThucHanh;

import java.util.Scanner;

public class PTBac1 {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            double x = (c - b) / a;
            System.out.println("Phương trình có nghiệm duy nhất x = " + x);
        }
    }
}
