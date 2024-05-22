package day20240522.p;

public class DogWeightComparator implements MyComparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.weight == o2.weight) {
            return 0;
        } else if (o1.weight > o2.weight) {
            return 1;
        } else {
            return -1;
        }
    }
}
