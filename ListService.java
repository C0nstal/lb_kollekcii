import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListService {
    private List<Integer> list;
    private Random random;

    public ListService() {
        this.list = new ArrayList<>();
        this.random = new Random();
    }

    public void addToEnd(int c, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < c * n; i++) {
            list.add(random.nextInt());
        }
        long endTime = System.nanoTime();
        System.out.println("Время, затраченное на добавление случайных чисел в конец списка: " + (endTime - startTime) + " ns");
    }

    public void removeFromEnd(int c, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Время, затраченное на удаление чисел с конца списка: " + (endTime - startTime) + " ns");
    }

    public void addToRandom(int c, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < c * n; i++) {
            list.add(random.nextInt(list.size() + 1), random.nextInt());
        }
        long endTime = System.nanoTime();
        System.out.println("Время, затраченное на добавление случайных чисел в случайные позиции списка: " + (endTime - startTime) + " ns");
    }

    public void removeFromRandom(int c, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (!list.isEmpty()) {
                list.remove(random.nextInt(list.size()));
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Время, затраченное на удаление чисел из случайных позиций списка: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        ListService service = new ListService();
        int c = 10; // Пример значения c
        int n = 100; // Пример значения n

        service.addToEnd(c, n);
        service.removeFromEnd(c, n);
        service.addToRandom(c, n);
        service.removeFromRandom(c, n);
    }
}
