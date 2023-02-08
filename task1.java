//1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл

package DomashkiJava.New;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task1 {
    public static void main(String[] args) throws IOException {
    Logger logger = Logger.getLogger(task1.class.getName());
    
    FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        
        int[] array = { 9, 4, 7, 3, 5, 7, 3, 5 };
        int temp;
        
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    logger.info("j = " + j);
                    array[j + 1] = temp;
                }
            }
        }
        // конец сортировки
        System.out.println(Arrays.toString(array)); // выводим результат на консоль
    }
}
