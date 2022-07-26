package HomeWork1;

import java.util.Scanner;

public class TaskHard {
    public static void main(String[] args) {
        System.out.println("Введите оператор и два числа");
        Scanner sc = new Scanner(System.in);



        try {
            String operator = sc.nextLine();
            int a = sc.nextInt(), b = sc.nextInt();


            if (operator.equals("+")) {
                System.out.println(a + b);
            } else if (operator.equals("-")) {
                System.out.println(a - b);
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);

            }
        } catch (ArithmeticException e) {
            e.printStackTrace();

            System.out.println("Произошла недопустимая арифметическая операция");
        }





    }
}
