/*
Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
Затем вводятся 2 числа из этого диапазона. 
Используя данные из массива найдите их кубы.
Sample Input:          Sample Output:
    8                       512
    11                      1331
 */
package Home_Work_1;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args){
        try (Scanner iScanner = new Scanner(System.in)) {
            int number = 2;
            int[] arr = new int[number];
            
            for (int i = 0; i < number; i++) {
                System.out.printf("Введите n: ");
                arr[i] = iScanner.nextInt();
            }
            for (int i = 0; i < number; i++) {
                if(arr[i] < 1000){
                    System.out.println(arr[i] * arr[i] * arr[i]);
                }
            }
        }
    }
}