package day20240510.newP;

public abstract class EntitySort {
    //print不用重写
    public void print(Entity[] arr) {
        for (Entity entity : arr) {
            System.out.print(entity + " ");
        }
        System.out.println();
    }

    public abstract void startSort(Entity[] arr);
}
