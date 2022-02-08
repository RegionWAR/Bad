package JS;

import java.util.Scanner;

class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
    if ((x >= y && x <= z) || (x <= y && x >= z)) {
      System.out.println(x);
    } else {
      if ((y >= x && y <= z) || (y <= x && y >= z)) {
        System.out.println(y);
      } else {
        System.out.println(z);
      }
    }

    sc.close();

  }
}

/*
 * System.out.println(x.toLowerCase() + "\n" + x.toUpperCase()); // Большие и
 * маленькие буквы
 * System.out.println(x.contains(y)); // Содержиться ли строка y в строке x
 * System.out.println(x.charAt(n)); // Символ с индексом n из строки x
 * System.out.println(x.equals(y)); // Строка x совпадает с строкой y
 * System.out.println(x + " " + y + "\n" + (x + " " + y).length()); // Соединяем
 * 2 строки и выводим длину предложения
 * System.out.println((Integer.parseInt(x) + Integer.parseInt(y)) + "\n" + x +
 * y); // перевод строки в число
 * System.out.println(x.charAt(0) < x.charAt(++ind_prob)); // символ по индексу
 * в юникод
 * System.out.println((a < b) ? "Бой продолжается!" : "Холифилд - чемпион!"); //
 * альтернатива конструкции if/else
 * 
 * 1. Сначала выполняются действия в круглых скобках.
 * 2. Затем выполняются операции логического отрицания (!)
 * 3. Далее выполняются операции логического И (&&)
 * 4. В последнюю очередь выполняются операции логического ИЛИ (||).
 * // int z = x / y;
 * // int i = x % y;
 * // double y = sc.nextDouble();
 * // double z = sc.nextDouble();
 * // double sqrt = (x + y + z) / 3;
 * // double y = 5 * (x * x) + 2 * x + 11;
 * // double P = x + y + x + y;
 * // System.out.println((sc.nextLine()).length());
 */