package ThucHanh;

import java.util.Scanner;

public class ChiSoBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao(m): ");
        double height = sc.nextDouble();

        System.out.print("Nhập cân nặng(kg): ");
        double weight = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);


        if (bmi < 18)
            System.out.printf("BMI = %.2f: %s", bmi , " Gầy");
        else if (bmi < 25.0)
            System.out.printf("BMI = %.2f: %s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("BMI = %.2f: %s", bmi, "Thừa cân");
        else
            System.out.printf("BMI = %.2f: %s", bmi, "Béo phì");
    }


}
