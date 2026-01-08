package BaiTap;

import java.util.Scanner;

public class ChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int num = sc.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Số đã nhập không hợp lệ");
        }
        else {
            // xử lý số có 1 chữ số
            if (num < 10) {
                switch (num) {
                    case 0: System.out.println("zero"); break;
                    case 1: System.out.println("one"); break;
                    case 2: System.out.println("two"); break;
                    case 3: System.out.println("three"); break;
                    case 4: System.out.println("four"); break;
                    case 5: System.out.println("five"); break;
                    case 6: System.out.println("six"); break;
                    case 7: System.out.println("seven"); break;
                    case 8: System.out.println("eight"); break;
                    case 9: System.out.println("nine"); break;
                }
            }
            // xử lý số từ 10 đến 19
            else if (num < 20) {
                switch (num) {
                    case 10: System.out.println("ten"); break;
                    case 11: System.out.println("eleven"); break;
                    case 12: System.out.println("twelve"); break;
                    case 13: System.out.println("thirteen"); break;
                    case 14: System.out.println("fourteen"); break;
                    case 15: System.out.println("fifteen"); break;
                    case 16: System.out.println("sixteen"); break;
                    case 17: System.out.println("seventeen"); break;
                    case 18: System.out.println("eighteen"); break;
                    case 19: System.out.println("nineteen"); break;
                }
            }
            // xử lý số từ 20 đến 99
            else if (num < 100) {
                int tens = num / 10;
                int ones = num % 10;
                String result = "";

                switch (tens) {
                    case 2: result = "twenty"; break;
                    case 3: result = "thirty"; break;
                    case 4: result = "forty"; break;
                    case 5: result = "fifty"; break;
                    case 6: result = "sixty"; break;
                    case 7: result = "seventy"; break;
                    case 8: result = "eighty"; break;
                    case 9: result = "ninety"; break;
                }

                if (ones != 0) {
                    switch (ones) {
                        case 1: result += " one"; break;
                        case 2: result += " two"; break;
                        case 3: result += " three"; break;
                        case 4: result += " four"; break;
                        case 5: result += " five"; break;
                        case 6: result += " six"; break;
                        case 7: result += " seven"; break;
                        case 8: result += " eight"; break;
                        case 9: result += " nine"; break;
                    }
                }
                System.out.println(result);
            }
            // xử lý số từ 100 đến 999
            else {
                int hundreds = num / 100;
                int remainder = num % 100;
                String result = "";

                // đọc hàng trăm
                switch (hundreds) {
                    case 1: result = "one hundred"; break;
                    case 2: result = "two hundred"; break;
                    case 3: result = "three hundred"; break;
                    case 4: result = "four hundred"; break;
                    case 5: result = "five hundred"; break;
                    case 6: result = "six hundred"; break;
                    case 7: result = "seven hundred"; break;
                    case 8: result = "eight hundred"; break;
                    case 9: result = "nine hundred"; break;
                }

                if (remainder != 0) {
                    result += " and ";
                    // lặp lại logic đọc số < 100
                    if (remainder < 10) {
                        switch (remainder) {
                            case 1: result += "one"; break;
                            case 2: result += "two"; break;
                            case 3: result += "three"; break;
                            case 4: result += "four"; break;
                            case 5: result += "five"; break;
                            case 6: result += "six"; break;
                            case 7: result += "seven"; break;
                            case 8: result += "eight"; break;
                            case 9: result += "nine"; break;
                        }
                    } else if (remainder < 20) {
                        switch (remainder) {
                            case 10: result += "ten"; break;
                            case 11: result += "eleven"; break;
                            case 12: result += "twelve"; break;
                            case 13: result += "thirteen"; break;
                            case 14: result += "fourteen"; break;
                            case 15: result += "fifteen"; break;
                            case 16: result += "sixteen"; break;
                            case 17: result += "seventeen"; break;
                            case 18: result += "eighteen"; break;
                            case 19: result += "nineteen"; break;
                        }
                    }
                    else {
                        int tens = remainder / 10;
                        int ones = remainder % 10;
                        switch (tens) {
                            case 2: result += "twenty"; break;
                            case 3: result += "thirty"; break;
                            case 4: result += "forty"; break;
                            case 5: result += "fifty"; break;
                            case 6: result += "sixty"; break;
                            case 7: result += "seventy"; break;
                            case 8: result += "eighty"; break;
                            case 9: result += "ninety"; break;
                        }
                        if (ones != 0) {
                            switch (ones) {
                                case 1: result += " one"; break;
                                case 2: result += " two"; break;
                                case 3: result += " three"; break;
                                case 4: result += " four"; break;
                                case 5: result += " five"; break;
                                case 6: result += " six"; break;
                                case 7: result += " seven"; break;
                                case 8: result += " eight"; break;
                                case 9: result += " nine"; break;
                            }
                        }
                    }
                }
                System.out.println(result);
            }
        }

    }
}
