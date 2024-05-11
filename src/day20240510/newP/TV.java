package day20240510.newP;

public class TV extends Entity {

    public String id;
    public int price;

    public TV(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "电视机编号：" + this.id + ",价格为：" + this.price + "元！\t";
    }
}
