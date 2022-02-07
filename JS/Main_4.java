/*На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".*/

import java.util.Scanner;

class Main_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int a, b, c;
        if (x >= y && x >= z)
            a = x;
        else {
            if (y >= x && y >= z)
                a = y;
            else
                a = z;
        }
        if (x <= y && x <= z)
            c = x;
        else {
            if (y <= x && y <= z)
                c = y;
            else
                c = z;
        }
        b = (x + y + z) - (a + c);
        // System.out.println(a + b + c);
        if (a % 2 == 0)
            System.out.println(a);
        else {
            if (b % 2 == 0)
                System.out.println(b);
            else {
                if (c % 2 == 0)
                    System.out.println(c);
                else
                    System.out.println("Чётных чисел нет");
            }
        }

        sc.close();
    }
}