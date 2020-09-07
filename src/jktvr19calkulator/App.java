
package jktvr19calkulator;

import java.util.Scanner;


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

                switch (znak) {
                    case "+":
                        System.out.println(number1 + number2);
                        break;
                    case "-":
                        System.out.println(number1 - number2);
                        break;
                    case "*":
                        System.out.println(number1 * number2);
                        break;
                    case "/":
                        if (number2 == 0){

                            System.out.print("на ноль делить нельзя");
                        }else{

                            System.out.println(number1 / number2);
                        }      System.out.println(number1 / number2);
                        break;
                    default:
                       System.out.println(number1 * number2);
                       break;
               }
                System.out.println("Для продолжения нажмите\"y\",для выхода нажмите любую дргую");
                repeat = scanner.nextLine();
           }while(repeat.equals("y"));
        System.out.println("-----конец прогр-----");
    }  
}
