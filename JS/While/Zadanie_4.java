package JS.While;

/*На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов. 
Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно). 
Вывести слова необходимо в том же порядке, в котором они подаются на вход.*/
import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next().toLowerCase(), close = sc.next().toLowerCase();
        int start_uni = start.charAt(0), close_uni = close.charAt(0);
        while (sc.hasNext()) {
            String a = sc.next();
            if (a.charAt(0) >= start_uni && a.charAt(0) <= close_uni)
                System.out.println(a);

        }

        sc.close();
    }

}