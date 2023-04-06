package Home_Work_4;
import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        Deque<Integer> summ = new ArrayDeque<>();
        if(d1.size() == d2.size()){
            int Size = d1.size();
            for (int i = 0; i < Size; i++) {
                int sum = d1.getFirst() + d2.getFirst();
                d1.removeFirst();
                d2.removeFirst();
                if(sum >= 10 && sum < 100){
                    summ.add(sum % 10);
                    summ.add(sum / 10);
                }else summ.add(sum);
            }
        } else System.out.println("Введите ровныЙ массивы");
        System.out.println(summ);
    }
}