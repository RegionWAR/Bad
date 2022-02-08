package JS;

/*Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".*/
import java.util.Scanner;

class Test_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zapros_1 = sc.nextInt();
        switch (zapros_1) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("error");
        }
        sc.close();

    }
}