package day20240515.p;

public class Dog implements MyComparable {
    String name;
    double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "小狗名字：" + this.name + "，体重：" + this.weight + "kg\t";
    }

    @Override
    public int compareTo(MyComparable other) {
        Dog o = (Dog) other;
        if (this.weight == o.weight) {
            return 0;
        } else if (this.weight > o.weight) {
            return 1;
        } else {
            return -1;
        }
    }
}
