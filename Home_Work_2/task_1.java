// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

package Home_Work_2;
public class task_1 {
    public static String shuffle(final String s, final int[] index) {
        char[] ArrChr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ArrChr[index[i] - 1] = s.charAt(i);
        }
        return new String(ArrChr);
    }
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        String result = shuffle(s, index);
        System.out.println(result);
    }
}