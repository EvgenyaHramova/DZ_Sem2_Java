import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
//  Без встр. функций


public class _2z_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();
        System.out.println(palindrom(str));
        input.close();
    }
    static boolean palindrom(String str){
        // StringBuilder user_input = new StringBuilder();
        for (int i = 0; i < str.length()/2; i++){
            
            if (str.charAt(i) != str.charAt(str.length() - i -1)){
                return false;
            }
        }
        return true;
    }
}
