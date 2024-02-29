package ru.krista.example;

import java.util.Scanner;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world. 
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int r;
        String op;

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите выражение: ");
        String str = in.nextLine();
        in.close();

        String[] parts = str.split(" ");
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
         } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число");
            return;
         }
       
        op = parts[1];
        switch (op) {
            case "+":
                r = num1 + num2;
                break;
            case "-":
                r = num1 - num2;
                break;
            case "*":
                r = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("На ноль делить нельзя");
                }
                r = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.println(num1 + " " + op + " " + num2 + " = " + r);
    }

}
