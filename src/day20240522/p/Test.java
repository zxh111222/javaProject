package day20240522.p;

public class Test {
    public static void main(String[] args) {

        int size = 5;
        //创建学生对象数组
        Student[] studentArr = new Student[size];
        studentArr[0] = new Student("ZXH", 'Z', 22);
        studentArr[1] = new Student("ABC", 'A', 23);
        studentArr[2] = new Student("UFO", 'U', 24);
        studentArr[3] = new Student("BCD", 'B', 21);
        studentArr[4] = new Student("SB", 'S', 25);

        MyComparator comparator = new StudentFirstLetterCompare();
//        MyComparator comparator = new StudentAgeCompare();

        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr, comparator);
        MySortUtil.print(studentArr);


        System.out.println("=== === ===");

//        Dog[] dogArr = new Dog[5];
//        for (int i = 0; i < ; i++) {
//
//        }

    }

}
