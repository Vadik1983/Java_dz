import java.util.*;


public class Main_3_1 {


    public static void main(String[] args) {

        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        userInput();
        array2(getRandom()); // Не уверен, что метод вызывающий метод хорошая идея, но по другому не получилось.
    }                      // Использовал для вывода list. Это оказалось удобно.

    static int n;
    static int a;
    static int b;
    public static void userInput() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число n:");
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

    public static int[] getRandom() {
        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (a < 0) {
                array[i] = r.nextInt(b) - a;
            } else{
                array[i] = r.nextInt(b);
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void array2(int[] array) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                list.add(array[i]);
        }
        System.out.println(list);
    }

}

