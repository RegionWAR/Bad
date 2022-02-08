package JS;

/*На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b. */
import java.util.Scanner;

class Test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double zapros_1 = sc.nextDouble(), zapros_2 = sc.nextDouble();
        if (zapros_1 < zapros_2)
            System.out.println("<");
        if (zapros_1 > zapros_2)
            System.out.println(">");
        if (zapros_1 == zapros_2)
            System.out.println("=");
        sc.close();

    }
}