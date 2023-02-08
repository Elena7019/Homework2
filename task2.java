package DomashkiJava.New;

import java.util.logging.*;
import java.io.IOException;
//import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException { 
    Logger logger = Logger.getLogger(task.class.getName());
    
    FileHandler fh = new FileHandler("log2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

    try (Scanner scanner = new Scanner(System.in)) {
        double res;
        System.out.print("Введите число n: ");
        double n = scanner.nextDouble();
        System.out.print("Введите действие (+, -, /, *): ");
        char q = scanner.next().charAt(0);
        System.out.print("Введите число m: ");
        double m = scanner.nextDouble();
            
            switch(q){
                case '+': res = n + m;
                    break;
                case '-': res = n - m;
                    break;
                case '*': res = n * m;
                    break;
                case '/': res = n / m;
                    break;
                default:  System.out.println("Недопустимое действие");
                    return;
            }
            logger.info(n + " " + q + " " + m + " = " + res);
            System.out.printf(n + " " + q + " " + m + " = " + res);
        }
    }
}
    
   
   
