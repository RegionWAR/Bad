package JS.While;

/*На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями.
Если входящее число отрицательное или больше 10, последовательность прерывается.
Посчитайте среднюю оценку фильма. */
import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ocenka = 0, col_ocen = 0;
        while (true) {
            Double c = sc.nextDouble();
            if (c > 10)
                break;
            if (c < 0)
                break;
            else {
                ocenka += c;
                col_ocen++;
            }

        }
        Double sr_ocenka = ocenka / col_ocen;
        System.out.println(sr_ocenka);

        sc.close();
    }

}