package JS;
/*Оператор switch - Это очень удобная конструкция для выбора каких-либо действий по конкретным флагам. 
*Конструкция проверяет переменную на равенство с определённым заранее списком значений.*/

import java.util.Scanner;

class Swicht {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zapros = sc.nextLine();
        switch (zapros) {
            case ("System.out.println()"):
                System.out.print("Это команда вывода на печать");
                break;
            case ("if"):
                System.out.print("Это условный оператор");
                break;
            case ("else"):
                System.out.print("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.print("Раздел в разработке");
        }
        sc.close();

    }
}