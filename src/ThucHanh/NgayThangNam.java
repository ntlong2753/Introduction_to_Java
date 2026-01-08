package ThucHanh;

import java.util.Scanner;

public class NgayThangNam {
    public static void main(String[] args) {
        boolean kiemTraNamNhuan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        boolean kiemTra = year < 0 || year == 0;

        if (kiemTra) {
            System.out.println("Năm không hợp lệ");
        }
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                    break;
                case 2:
                    kiemTraNamNhuan = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                    if (kiemTraNamNhuan) {
                        System.out.println("Tháng " + month + "năm " + year + " là năm nhuận, có 29 ngày ");
                    }
                    else {
                        System.out.println("Tháng " + month + "năm " + year + " không là năm nhuận, có 28 ngày ");
                    }
                default:
                    System.out.println("Tháng không hợp lệ");
            }
        }


    }
}

