package day04;

public class Goods implements Comparable{
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //指明商品比较大小的方式
    public int compareTo(Object o) {
        if(o instanceof Goods)
        {
            Goods goods=(Goods) o;
            if(this.price > goods.price)
            {
                return 1;
            }
            else if (this.price < goods.price)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
