import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main_4_1 {

    private static Collections Lists;

    public static void main(String[] args) {
    /*
	Пусть дан LinkedList с несколькими элементами.
     Реализуйте метод, который вернет “перевернутый” список.
     Постараться не обращаться к листу по индексам.
    */
        newList();
    }
    public static List<Integer> newList() {
        List<Integer> list = new LinkedList<>();
        list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        Lists.reverse(list);
        System.out.println(list);
        return list;
    }
}