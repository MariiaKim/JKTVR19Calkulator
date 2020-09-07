/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19calkulator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private String repeat = "y";
    public void run(){
        
           System.out.println("------калькулятор------");
           do{
            System.out.println("Введите первое число");
            Scanner scanner = new Scanner(System.in); 
            double number1 = scanner.nextDouble();int name = 3;



            System.out.println("Введите второе число  ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введите операцию:(+,-,*,/)");

            String znak = scanner.nextLine();
            System.out.print("Результат   ");

                if ("+".equals(znak)) {
                System.out.println(number1 + number2);
            }
                if ("-".equals(znak)) {
                System.out.println(number1 - number2);
            }
                if ("*".equals(znak)) {
                System.out.println(number1 * number2);
            }
                if ("/".equals(znak)) {
                    if (number2 == 0){

                    System.out.print("на ноль делить нельзя");
                }else{

                   System.out.println(number1 / number2); 
                }
                System.out.println(number1 / number2);



            }
                System.out.println("Для продолжения нажмите\"y\",для выхода нажмите любую дргую");
                repeat = scanner.nextLine();
           }while(repeat.equals("y"));
        System.out.println("-----конец прогр-----");
    }  
}
