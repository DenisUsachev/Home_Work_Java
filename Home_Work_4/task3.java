package Home_Work_4;
import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Deque<Integer>deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i++) {
            int f = deque.pollFirst(); //брать первое значение и удалять
            int l = deque.pollLast(); // брать последнее значение и удалять
            if (f != l) {
                res = false;
                break;
            }
        }System.out.println(res ? "Палиндром": "Не палиндром");
    }
}