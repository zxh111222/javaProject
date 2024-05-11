package day20240510.newP;

public class TVSort extends EntitySort{
    @Override
    public void startSort(Entity[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (((TV) arr[j]).price > ((TV) arr[j+1]).price) {
                    Entity temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
