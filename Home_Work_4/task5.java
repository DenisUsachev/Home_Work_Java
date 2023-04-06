package Home_Work_4;
import java.util.*;
public class task5 {
    public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<String>(Arrays.asList("{" , "[" ,"(", ")", "]", "}"));
        List<String> chr = new ArrayList<String>(Arrays.asList("()", "()[]", "{[()]}", "()()"));
        String GetBool = "";
        boolean res = false;
        int dSize = d1.size();
        for (int i = 0; i < dSize; i++) {
            GetBool +=  d1.getFirst();
            d1.removeFirst();
        }
        System.out.println(GetBool);

        int chrSize = chr.size();
        for (int j = 0; j < chrSize; j++) {
            if(GetBool.equals(chr.get(j))) res = true;
        }System.out.println(res ? "Логически правильна!": "Не является логически правильной!");
    }
}