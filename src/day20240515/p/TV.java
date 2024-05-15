package day20240515.p;

public class TV implements MyComparable {
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
    public int compareTo(MyComparable other) {
        TV o = (TV) other;
        if (this.price == o.price) {
            return 0;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return -1;
        }
    }

}
