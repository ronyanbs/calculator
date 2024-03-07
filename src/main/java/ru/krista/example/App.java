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
          
        Calculator calculator = new Calculator();
        calculator.Numbers();
        calculator.Switch();
        calculator.Output ();
    }

}
