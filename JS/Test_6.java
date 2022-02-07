
/*На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область. https://ucarecdn.com/498cc2c7-ccab-4ba2-88d6-36cdb68f2680/*/
import java.util.Scanner;

class Test_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float x = sc.nextFloat(), y = sc.nextFloat();
        if (x < 0) {
            if (x <= y && y <= (2 - (x * x)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        if (x >= 0) {
            if (y >= 0 && y <= (2 - (x * x)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();

    }
}