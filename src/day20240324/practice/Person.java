package day20240324.practice;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  09:14
 * @Description: TODO
 */
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void havePet(Cat cat){
        System.out.print(this.name + "养了一只");
        cat.getChineseName();
    }
    public void havePet(Dog dog){
        System.out.print(this.name + "养了一只");
        dog.getChineseName();
    }

}
