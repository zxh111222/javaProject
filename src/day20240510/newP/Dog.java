package day20240510.newP;

public class Dog extends Entity {
    public String name;
    public int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "小狗名字：" + this.name + "，体重：" + this.weight + "kg\t";
    }
}
