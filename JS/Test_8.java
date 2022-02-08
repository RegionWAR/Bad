package JS;

/*На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово"*/
import java.util.Scanner;

class Test_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        int name_0 = sc.nextLine().length();
        switch (name_0) {
            case 1:
                System.out.println("Одна буква");
                break;
            case 2:
                System.out.println("Две буквы");
                break;
            case 3:
                System.out.println("Три буквы");
                break;
            case 4:
                System.out.println("Четыре буквы");
                break;
            case 5:
                System.out.println("Пять букв");
                break;
            default:
                System.out.println("Длинное слово");
        }
        sc.close();

    }
}