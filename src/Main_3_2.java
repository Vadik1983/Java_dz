import java.util.*;


public class Main_3_2 {
    public static void main(String[] args) {

        //Задан целочисленный список ArrayList. Найти минимальное,
        // максимальное и среднее арифметическое из этого списка. Collections.max()
        userInput();
        getRandom();
        maxMin(list);
        average(list);
    }


    static int n;
    static int a;
    static int b;
    static List<Integer> list = new ArrayList<Integer>();


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

    public static List<Integer> getRandom() {
        Random r = new Random();

        if (a < 0) {
            for (int i = 0; i < n; i++) {
                list.add(r.nextInt(b - a) + a);
            }
        }        else{
            for (int i = 0; i < n; i++) {
                list.add((int)(r.nextInt(b)));
            }
        }
        System.out.println(list);
        return list;
    }
    public static void maxMin(List<Integer> list){
        System.out.println("Максимальное значение в списке = " + Collections.max(list));
        System.out.println("Минимальное значение в списке = " + Collections.min(list));
    }
    private static void average(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i);
        }
        System.out.println("Среднее арифметическое элементив списка = " + sum / n);
    }

}
