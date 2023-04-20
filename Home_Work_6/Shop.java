/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объём ЖД

3 - Операционная система

4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package Home_Work_6;
import java.util.*;
public class Shop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        // Характеристики ноутбуков
        Laptops model = new Laptops();  //"", 2, 120, "Wn", "red", 15000);
        model.brand = "Lenovo";
        model.OZY = 2;
        model.valumeDist = 120;
        model.OS = "Wn";
        model.color = "Red";
        model.price = 15000;
        
        Laptops model2 = new Laptops();//"Hp", 16, 512, "Wn", "Write", 45000);
        model2.brand = "Hp";
        model2.OZY = 16;
        model2.valumeDist = 512;
        model2.OS = "Wn";
        model2.color = "Write";
        model2.price = 45000;
       
        Laptops model3 = new Laptops(); //"Dell", 6, 240, "Linus", "Blue", 35000
        model3.brand = "Dell";
        model3.OZY = 6;
        model3.valumeDist = 240;
        model3.OS = "Linux";
        model3.color = "Blue";
        model3.price = 35000;
       
        Laptops model4 = new Laptops();//"Apple", 12, 1024, "MacOS", "Grey", 120000
        model4.brand = "Apple";
        model4.OZY = 12;
        model4.valumeDist = 1024;
        model4.OS = "MacOS";
        model4.color = "Grey";
        model4.price = 120000;
        
        Laptops model5 = new Laptops();//"Asus", 4, 2048, "Wn", "Black", 40000
        model5.brand = "Asus";
        model5.OZY = 4;
        model5.valumeDist = 2048;
        model5.OS = "Wn";
        model5.color = "Black";
        model5.price = 40000;
        
        Laptops model6 = new Laptops(); //"Acer", 8, 64, "Linux", "Pink", 20000
        model6.brand = "Acer";
        model6.OZY = 8;
        model6.valumeDist = 64;
        model6.OS = "Linux";
        model6.color = "Pink";
        model6.price = 20000;
        
        //Создаём множество ноутбуков
        var top = new HashSet<Laptops>(Arrays.asList(model,model2,model3,model4,model5,model6));
        
        //Вывод набора ноутбуков в продаже
        for (var item : top) System.out.printf(item.toString());
        
        // Ввод с консоли желанных пармтров
        Laptops criteries = new Laptops();
        
        System.out.println("Какой бренд вы бы хотели: ");
        String bn = scr.nextLine();
        criteries.brand = bn;
        
        System.out.println("Какой размер OZY вы бы хотели: ");
        int zy = scr.nextInt();
        criteries.OZY = zy;
        
        System.out.println("Какой объем ЖД вы бы хотели: ");
        int vD = scr.nextInt();
        criteries.valumeDist = vD;

        System.out.println("Какую OS вы бы хотели: ");
        String os = scr.nextLine();
        criteries.OS = os;

        System.out.println("Какой цвет вы бы хотели: ");
        String col = scr.nextLine();
        criteries.color = col;

        System.out.println("Какую цену вы бы хотели: ");
        int prc = scr.nextInt();
        criteries.price = prc;
        
        //Вывод ноутбука, который подошёл по одному из критериев!
        for (var item1 : top) {
            if(item1.equals(criteries)){
                System.out.println("Вот этот ноутбук подходит под ваши задачи! " + item1);
            }
        }
    System.out.println("Всего доброго!");
    }   
}
