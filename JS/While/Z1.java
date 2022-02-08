package JS.While;

/*На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.

Примечание. Так как маркер конца последовательности в этой задаче отсутствует, 
будет удобно воспользоваться методом hasNext(). Найдите самостоятельно, как он работает. */
import java.util.Scanner;

class Z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (sc.hasNext()) {
            sc.next();
            a++;
        }
        System.out.println(a);
        sc.close();

    }
}