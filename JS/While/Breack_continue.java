package JS.While;

/*Команда break немедленно прерывает работу цикла (исполнение программы переходит к командам, 
*расположенным после цикла), а команда continue завершает текущую итерацию (цикл переходит к 
*исполнению следующей итерации)*/
public class Breack_continue {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            x++;
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x);
            if (x == 5) {
                break;
            }
        }
        System.out.println("The end");
    }
}

/*
 * 1
 * 3
 * 5
 * The end
 */
