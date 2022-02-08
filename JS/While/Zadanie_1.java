package JS.While;

/*На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, 
не делящееся на 11 (это число не входит в последовательность).
Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.*/
import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (true) {
            int c = sc.nextInt();
            if (c % 11 != 0)
                break;
            else {
                a++;
                if (c % 3 == 0)
                    b += c;
            }
        }
        System.out.println(a);
        System.out.println(b);

        sc.close();
    }

}
