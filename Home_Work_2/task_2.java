/*Task_2

На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2",
где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется,
что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!!
Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */
package Home_Work_2;
public class task_2 {
    public static void main(String[] args) {

        String[] recipe = new String[2];
        String[] replace = new String[3];

        recipe[0] = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        recipe[1] = "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";

        replace[0] = "арахис - колбаса";
        replace[1] = "клубника - вишня";
        replace[2] = "сгущенка - молоко";

        String get = "";
        String res = "";

        for (String on : replace) {
            get = on.substring(0, on.indexOf(" -"));
            res = on.substring(on.indexOf("- ") + 2);

            for (String grocery_list : recipe) {

                String newgrocery_list = grocery_list;
                String[] words = grocery_list.split("\\s");
                
                for (String word : words) {
                    StringBuilder replmnt2 = new StringBuilder(res);
                    
                    if (word.compareToIgnoreCase(get) == 0) {
                        if (Character.isUpperCase(word.charAt(0))) {
                        replmnt2.setCharAt(0, Character.toUpperCase(replmnt2.charAt(0)));
                        newgrocery_list = newgrocery_list.replace(word, replmnt2);
                        }
                    }
                }
                recipe[java.util.Arrays.asList(recipe).indexOf(grocery_list)] = newgrocery_list;
            }
        }

        for (String grocery_list : recipe) {
            System.out.println(grocery_list);
        }
    }
}