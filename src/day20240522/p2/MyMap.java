package day20240522.p2;

public class MyMap<K, V> {
    K data1;
    V data2;

    public MyMap() {
    }

    public MyMap(K data1, V data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void set(K data1, V data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public V get(K data1) {
        if (this.data1.equals(data1)) {
            return data2;
        } else {
            return null;
        }
    }
}
