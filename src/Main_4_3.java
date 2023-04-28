import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main_4_3 {

    public static int n;          // static получается много, но пока не получается без них передать переменную
    public static int a;          // из метода в метод. Для этого нужно создавать новый класс, как во второй задаче?
    public static int b;          // И какие у static недостатки?

    public static void main(String[] args) {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    */

        userInput();
        getRandom();
        sumElemList(list);
    }

    static List<Integer> list = new ArrayList<>();

    public static void userInput() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов:");
            n = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите минимальное значение:");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите максимальное значение:");
            b = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void getRandom() {
        Random r = new Random();
        if (a < 0) {
            for (int i = 0; i < n; i++) {
                list.add(r.nextInt(b - a) + a);
            }
        } else {
            for (int i = 0; i < n; i++) {
                list.add(r.nextInt(b));
            }
        }
        System.out.println(list);
    }

    public static void sumElemList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator(); {
            int sum = 0;
            while(iterator.hasNext()){
                sum += iterator.next();
            }
            System.out.println("Сумма элементов в списке = " + sum );
        }
    }
}

