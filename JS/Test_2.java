
/*На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров. */
import java.util.Scanner;

class Test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zapros_1 = sc.nextLine().toUpperCase(), zapros_2 = sc.nextLine().toUpperCase();
        if (zapros_1.contains(zapros_2) == true)
            System.out.print("true");
        else
            System.out.println("false");
        sc.close();

    }
}