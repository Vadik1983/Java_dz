import java.util.*;

public class Main_3_3 {
    public static int n;
    public static String a = "Меркурий";
    public static String b = "Венера";
    public static String c = "Земля";
    public static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
    /*Заполнить список названиями планет Солнечной системы в произвольном порядке
     с повторениями. Вывести название каждой планеты и количество его повторений в списке.
    */

        planet();
        creatList();

    }

    public static void planet() {

        String a = "Меркурий";
        String b = "Венера";
        String c = "Земля";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество планет в списке: ");
            n = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static ArrayList<String> creatList() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            try (Scanner scanner1 = new Scanner(System.in)) {
                System.out.println("Введите символ планеты: ");
                char action = scanner1.next().charAt(0);
                boolean res = switch (action) {
                    case '1' -> {
                        list.add(a);
                        yield true;
                    }
                    case '2' -> {
                        list.add(b);
                        yield true;
                    }
                    case '3' -> {
                        list.add(c);
                        yield true;
                    }
                    default -> {
                        int o = 0;
                        yield false;
                    }
                };
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(list);
        return list;
    }
    public static void countName(){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (list.get(i) == list.get(i - 1)){
                count++;
            } else { stringBuilder.append(list.get(i - 1));
                if (count > 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }
    }
}
