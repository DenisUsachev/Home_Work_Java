/*Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами. */
package Home_Work_1;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args){
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("a: ");
            int a = iScanner.nextInt();
            int summ = a;
            while (true) {
                System.out.printf("1 = '+',  2 = '-',  3 = '*',  4 = '=': ");
                Integer chr = iScanner.nextInt();
                
                if(chr == 4) {
                    System.out.println(summ);
                    break;
                } else{
                    System.out.printf("b: ");
                    int b = iScanner.nextInt(); 
                    if(chr == 1) summ += b;
                    if(chr == 2) summ -= b;
                    if(chr == 3) summ *= b;
                }
            }
        }                 
    }
}

