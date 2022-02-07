
/*На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является средней в числе (разряд десятков), 
и false - если нет. Если введённое число не является трёхзначным, выведите "error". */
import java.util.Scanner;

class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zapros_1 = sc.nextInt(), zapros_2 = sc.nextInt();
        if (zapros_1 < 0)
            zapros_1 *= (-1);
        if (zapros_2 < 0)
            zapros_2 *= (-1);
        if (zapros_1 < 100 || zapros_1 > 999 == true)
            System.out.print("error");
        else {
            if (((zapros_1 - (zapros_1 % 10)) / 10) % 10 == zapros_2)
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();

    }
}