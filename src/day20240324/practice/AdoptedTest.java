package day20240324.practice;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  09:29
 * @Description: TODO
 */
public class AdoptedTest {
    public static void main(String[] args) {
        Person person1 = new Person("张三");
        Cat cat = new Cat();
        person1.havePet(cat);
        Person person = new Person("李四");
        Dog dog = new Dog();
        person.havePet(dog);
    }


}
