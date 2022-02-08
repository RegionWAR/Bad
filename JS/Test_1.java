package JS;

/*На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".  */
import java.util.Scanner;

class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zapros = sc.nextInt();
        if (zapros > 99 && zapros < 1000)
            System.out.print("YES");
        else
            System.out.println("NO");
        sc.close();

    }
}