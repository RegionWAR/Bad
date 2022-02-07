import java.util.Scanner;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), razn = sc.nextInt();
        int max = a, min = b;
        if (a >= b && a >= c) {
            max = a;
        } else {
            if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }
        }
        if (a <= b && a <= c) {
            min = a;
        } else {
            if (b <= a && b <= c) {
                min = b;
            } else {
                min = c;
            }
        }
        if (max - min > razn) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }

        sc.close();
    }
}
/*
 * ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали,
 * что их зарплаты различаются. Разработчики решили объявить забастовку, если
 * разница максимальной и минимальной зарплаты превысит определённый уровень.
 * Определите, грозит ли ООО "Круче Гугла" забастовка.
 * 
 * Формат ввода:
 * 
 * В первой строке - зарплаты разработчиков через пробел, три целых числа.
 * 
 * Во второй строке - разница, при превышении которой будет объявлена
 * забастовка.
 * 
 * Формат вывода:
 * 
 * "Ура, бастуем!" - если критический уровень превышен;
 * 
 * "За работу, Солнце ещё высоко" - если критический уровень не превышен.
 */