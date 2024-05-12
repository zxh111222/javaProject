package day20240512.p;

public abstract class MyComparable {

    public abstract double toNumber();

    public int compareTo(MyComparable e1, MyComparable e2) {
        int comparativeResult;
        if ((int) (e1.toNumber() - e2.toNumber()) > 0) {
            comparativeResult = 1;
        } else if ((int) (e1.toNumber() - e2.toNumber()) < 0) {
            comparativeResult = -1;
        }else {
            comparativeResult = 0;
        }
        return comparativeResult;
    }
}
