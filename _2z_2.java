// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


public class _2z_2 {
    // метод к 3 варианту
    public static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileInputStream fileStream = new FileInputStream(new File(path));
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
 
        String line;
        while ((line = br.readLine()) != null) {
           sb.append(line+System.lineSeparator()); //   +"," 
        }
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException{
        // 1 variant schitivania

        // String path = "text_k_z2.txt";
        // File file = new File(path);
        // // String str;
        // Scanner input_ = new Scanner(file);
        // while(input_.hasNext()){

        //     System.out.println(input_.next());
        // }
        
        // input_.close();   
        
        // // 2 variant schitivania

        // BufferedReader br = new BufferedReader(new FileReader("text_ k_z2.txt"));
        // String str;
        // StringBuilder user = new StringBuilder();
        // while( str != null) { 
        //         user.append(br.readLine()).append("\n"); Не работает, выводит только вторую строку
        //     }
        // System.out.println(user);
        // str = user.toString();
        // System.out.println(str);

        // try {
        //     while((str = br.readLine()) != null) {
        //         System.out.println(str);
        //         System.out.println(str.length());
        //     }
            
        // } catch(IOException e) {
        //     System.out.print("ERROR:" + e);
        // }
        // br.close();

        // 3 вариант
        String filePath = "text_k_z2.txt";
 
        String content = "";
        try {
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        // System.out.print(content);
        // System.out.println();
        // System.out.println(content.length());
        // StringBuilder sb1 = new StringBuilder(content);
        StringBuilder sb1 = new StringBuilder();
        for (char i : content.toCharArray()){
                if (i != '\"' ){            //&& i != '\n'
                    sb1.append(i);
                }
        }
        System.out.print(sb1);
        System.out.println();
        String str_sb1 = sb1.toString();
        str_sb1 = str_sb1.replaceAll("[:,\r]", " ");
        String str_sb2 = str_sb1.replaceAll("фамилия", "Студент");
        String str_sb3 = str_sb2.replaceAll("оценка", "получил");
        String str_sb4 = str_sb3.replaceAll("предмет", "по предмету");
       
        System.out.print(str_sb4);
        // String[] result = str_sb1.split(" ");
        
        // // System.out.print(Arrays.toString(result));
                
        // // for (String w : result){
        // //         System.out.print(w);             
        // //     }          
        }   
    }
    