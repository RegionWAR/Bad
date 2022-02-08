package JS.While;

/*На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.*/
import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nat_chisl = sc.nextLine();
        int length = nat_chisl.length();
        while (length >= 0) {
            length--;
            if (length < 0)
                break;
            System.out.print(nat_chisl.charAt(length));

        }

        sc.close();
    }

}