package day20240510.newP;

public class Test {
    /**
     * 以终为始
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

        MySortUtil.sort(new StudentSort(), studentArr);
//        MySortUtil.sort(new DogSort(), dogArr);




    }
}
