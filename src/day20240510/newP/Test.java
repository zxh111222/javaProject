package day20240510.newP;

public class Test {
    /**
     * 以终为始
     * 1.不用修改MySortUtil
     * 2.需要其他类型时,如新类型xxx，加上xxx.java继承于Entity
     * 3.同时写xxxSort.java继承于EntitySort
     * 4.最后在这里添加即可
     */
    public static void main(String[] args) {

        int size = 5;
        //创建学生对象数组
        Entity[] studentArr = new Entity[size];
        studentArr[0] = new Student("zxh", 22);
        studentArr[1] = new Student("zcy", 23);
        studentArr[2] = new Student("zzj", 24);
        studentArr[3] = new Student("ys", 21);
        studentArr[4] = new Student("yqh", 25);
        //创建狗狗对象数组
        Entity[] dogArr = new Entity[size];
        dogArr[0] = new Dog("圆圆", 32);
        dogArr[1] = new Dog("球球", 6);
        dogArr[2] = new Dog("小黑", 30);
        dogArr[3] = new Dog("大黄", 14);
        dogArr[4] = new Dog("二哈", 22);
        //创建TV对象数组
        Entity[] tvArr = new Entity[size];
        tvArr[0] = new TV("编号1", 9999);
        tvArr[1] = new TV("编号2", 999);
        tvArr[2] = new TV("编号3", 5999);
        tvArr[3] = new TV("编号4", 2999);
        tvArr[4] = new TV("编号5", 7999);

        MySortUtil.sort(new StudentSort(), studentArr);

        System.out.println("====================");

        MySortUtil.sort(new DogSort(), dogArr);

        System.out.println("====================");

        MySortUtil.sort(new TVSort(), tvArr);

        System.out.println("====================");



    }
}
