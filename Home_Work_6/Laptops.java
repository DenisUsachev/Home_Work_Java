package Home_Work_6;
public class Laptops {
    public String brand;
    public int OZY;
    public int valumeDist;
    public String OS;
    public String color;
    public int price;

    @Override
    public String toString(){
        return String.format("Brand: %s \tOZY: %d \tvalumeDist: %d \tOS: %s \tcolor: %s \tPrice: %d\n", brand, OZY, valumeDist, OS, color, price);
    }

    @Override
    public boolean equals(Object o) {
        Laptops t = (Laptops) o;
        return  brand == t.brand || OZY == t.OZY || valumeDist == t.valumeDist || OS == t.OS || color == t.color || price == t.price;
    }
}


