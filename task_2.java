/*Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.
Sample Input:              Sample Output:
    4                           2
    1                           4
    2                           6
    3                           10
    5
    2           */
package Home_Work_1;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args){
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("cnt: ");
            int cnt = iScanner.nextInt();
            int[] arr = new int[cnt];

            for (int i = 0; i < cnt; i++) {
                System.out.printf("Введите n: ");
                arr[i] = iScanner.nextInt();
            }
            System.out.println("Введите x: ");
            int x = iScanner.nextInt();
            
            for (int i = 0; i < cnt; i++) {
                System.out.println(arr[i] * x);
            }
        }
    }
}
