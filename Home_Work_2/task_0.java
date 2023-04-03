/*Прочитайте количество драгоценных камней в куче обычных камней
драгоценности = "aB"
камней = "aaaAbbbB"
резулт a3B1*/

package Home_Work_2;
public class task_0 {
    public static void main(String[] args) {
        String kamnei = "aaaAbbbB";
        String dragon = "aB";
        String[] drg = dragon.split("");
        
        int CntIndexZero = 0;
        int CntIndexFirst = 0;

        for (int i = 0; i < kamnei.length(); i++) {
            if (kamnei.charAt(i) == dragon.charAt(0))      CntIndexZero++;
            else if(kamnei.charAt(i) == dragon.charAt(1))  CntIndexFirst++;
        }


        //String res = dragon.charAt(0) + CntIndexZero + dragon.charAt(1) + CntIndexFirst;
        System.out.println(drg[0] + CntIndexZero + drg[1] + CntIndexFirst);
    }  
}
