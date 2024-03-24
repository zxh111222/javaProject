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


    public void havePet(Animal animal){
        System.out.println(this.name + "养了一只" + animal.chineseName);
    }

//    public void havePet(Cat cat){
//        System.out.print(this.name + "养了一只" + cat.chineseName);
//    }
//    public void havePet(Dog dog){
//        System.out.print(this.name + "养了一只" + dog.chineseName);
//    }
//
//    public void havePet(Pig pig){
//        System.out.print(this.name + "养了一只" + pig.chineseName);
//    }


}
