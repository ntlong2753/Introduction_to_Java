package BaiTap;

import java.util.Scanner;

public class ChuyenDoTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số tiền (USD): ");
        double USD = input.nextDouble();

        double VND = USD * 26000;

        if (USD < 0) {
            System.out.println("Số tiền không hợp lệ!");
        }
        else {
            System.out.println(USD + " USD =" + VND + " VND");
        }
    }
}
