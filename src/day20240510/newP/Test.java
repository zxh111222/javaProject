package day20240510.newP;

import day20240510.p.Student;

public class Test {
    /**
     * 以终为始
     */
    public static void main(String[] args) {

        int size = 5;
        //创建学生对象数组
        Student[] studentArr = new Student[size];
        studentArr[0] = new Student("zxh", 22);
        studentArr[1] = new Student("zcy", 23);
        studentArr[2] = new Student("zzj", 24);
        studentArr[3] = new Student("ys", 21);
        studentArr[4] = new Student("yqh", 25);
        //创建狗狗对象数组
        Dog[] dogArr = new Dog[size];
        dogArr[0] = new Dog("圆圆", 32);
        dogArr[1] = new Dog("球球", 6);
        dogArr[2] = new Dog("小黑", 30);
        dogArr[3] = new Dog("大黄", 14);
        dogArr[4] = new Dog("二哈", 22);





        MySortUtil.sort();



    }
}
