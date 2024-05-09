package day20240508.practice;

public class Sum100 extends Algorithm{
    public void algorithm(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
