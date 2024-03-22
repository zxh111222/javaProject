package day20240322.override_rules;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  19:38
 * @Description: TODO
 */
public class Person {

    public String name;
    public String cardId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void eat(){
        System.out.println("吃吃吃。。。。。");

    }
    public Animal animal(Animal animal){
        System.out.println("123");
        return animal;
    }

}
