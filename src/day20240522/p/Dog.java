package day20240522.p;

public class Dog {
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

}
