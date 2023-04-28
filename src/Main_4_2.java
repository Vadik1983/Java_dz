import java.util.Scanner;

public class Main_4_2 {
    public static int n;
    public static void main(String[] args) {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
     enqueue() - помещает элемент в конец очереди,
     dequeue() - возвращает первый элемент из очереди и удаляет его,
     first() - возвращает первый элемент из очереди, не удаляя.
     */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов очереди: ");
            n = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Queue myQueue = new Queue();
        for (int i = 0; i < n; i++) {
            myQueue.enQueue(i);
        }

        myQueue.display();
        System.out.println(" ");        // Ввёл проверку после каждого метода
        myQueue.deQueue();              // и пустую строку для удобства.
        System.out.println(" ");
        myQueue.display();
        myQueue.first();
        System.out.println(" ");
        myQueue.display();
    }

    static class Queue {
        int[] items = new int[n];
        int front = -1;
        int back = -1;

        public boolean isFull() {
            if (back == n - 1) {       // Эту конструкцию  с if среда предлагает заменить на:
                return true;           // return back == n - 1;
            } else {                   // По сути одно и тоже с другим подходом, или нет?
                return false;          // Ведь если не вернёт return back == n - 1; вернёт false?
            }
        }

        public boolean isEmpty() {
            if (front == -1 && back == -1) {
                return true;
            } else {
                return false;
            }
        }

        public void enQueue(int itemValue) {
            if (isFull()) {
                System.out.println("Очередь полна!");
            } else if (front == -1 && back == -1) {
                front = back = 0;
                items[back] = itemValue;
            } else {
                back++;
                items[back] = itemValue;
            }
        }

        public void deQueue() {
            if (isEmpty()) {
                System.out.println("Очередь пуста, выводить нечего!");
            } else if (front == back) {
                front = back = -1;
            } else {
                front++;
            }
        }

        public void display() {
            int i;
            if (isEmpty()) {
                System.out.println("Очередь пуста!");
            } else {
                for (i = front; i <= back; i++) {
                    System.out.println(items[i]);
                }
            }
        }

        public void first() {
            System.out.println("Первый элемент: " + items[front]);
        }
    }
}
