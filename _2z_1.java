// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class _2z_1 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(_2z_1.class.getName());
        // logger.setLevel(Level.INFO);
        // ConsoleHandler info = new ConsoleHandler();
        // logger.addHandler(info);
        // SimpleFormatter sFormat = new SimpleFormatter();
        // info.setFormatter(sFormat);
        FileHandler file_log = new FileHandler("log.txt");
        logger.addHandler(file_log);
        SimpleFormatter f_txt = new SimpleFormatter();
        file_log.setFormatter(f_txt);
        // logg.log(Level.INFO, "Логирование:");
        // logg.info("Итерация:");
       

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size]; 
        
        System.out.println("Введите значения элементов массива через Enter:");
    
        for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); // Заполняем массив введёнными с клавиатуры элементами 
        }
        System.out.print ("Получен следующий массив: ");
        System.out.println(Arrays.toString(array)); // Выводим полученный массив на экран 
        // for (int i = 0; i < size; i++) {
        // System.out.print (" " + array[i]); 
        // }
        input.close();
       

        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-1 - i; j++){
                if (array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    logger.log(Level.INFO,"Итерация замены элемента " + temp + " на элемент " + array[j]);
                    array[j+1] = temp;
                    
                }
            }
        }
        
        // for (int i : array){
        //     System.out.print(i +" ");
        //  }
        System.out.print ("Массив после сортировки: ");
        System.out.println(Arrays.toString(array));
           
}}