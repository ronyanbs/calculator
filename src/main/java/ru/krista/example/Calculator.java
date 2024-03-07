package ru.krista.example;

import java.util.Scanner;

public class Calculator {
    public int num1;
    public int num2;
    public int result;
    public String op;


public void Numbers (){
Scanner scanner = new Scanner(System.in);
    System.out.println("Введите выражение: ");
    String input = scanner.nextLine();
    scanner.close();
    String[] parts = input.split(" ");
    try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            op = parts [1];
        } catch (NumberFormatException e) {
        System.out.println("Не удалось получить число");
        return;
        }
}

public void Switch (){
    switch (op) {
        case "+":
            add();
            break;
        case "-":
            subtract ();
            break;
        case "*":
            multiply();
            break;
        case "/":
           div();
            break;
        default:
            System.out.printf("Ошибка");
            return;
}
}

public void add (){
    result = num1 + num2;

}

public void subtract (){
    result = num1 - num2;
}

public void multiply (){
    result = num1 * num2;
}

public void div (){
    if (num2 == 0) {
        System.out.printf("На ноль делить нельзя");
        System.exit(1);
    }
    result = num1 / num2;
}

public void Output (){
    System.out.print("\nРезультат:\n" + result );
}
}
