package day20240508.abstract_demo;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-24  09:14
 * @Description: TODO
 */
public abstract class Animal {

    public String chineseName;

    public Animal(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public abstract void newAbstractMethod(String text);

    public final void newFinalMethod(){
        System.out.println("1111111111111111");
    }

}
