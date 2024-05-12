package day20240512.p;

public class TV extends Entity{
    String name;
    double price;

    public TV(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "电视机编号：" + this.name + ",价格为：" + this.price + "元！\t";
    }

    @Override
    public double toNumber() {
        return this.price;
    }

}
