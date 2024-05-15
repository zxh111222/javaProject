package day20240515.p;

public class Test2 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';
        char e = 'E';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println((int)d);
        System.out.println((int)e);

        int size = 5;
        //创建学生对象数组
        MyComparable[] studentArr = new MyComparable[size];
        studentArr[0] = new Student("ZXH", 'Z', 22);
        studentArr[1] = new Student("ABC", 'A', 23);
        studentArr[2] = new Student("UFO", 'U', 24);
        studentArr[3] = new Student("BCD", 'B', 21);
        studentArr[4] = new Student("SB", 'S', 25);

        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);


    }

}
