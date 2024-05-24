package day20240522.p2;

public class MyMap<K, V> {
    K key;
    V value;

    public MyMap() {
    }

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key) {
        if (this.key.equals(key)) {
            return value;
        } else {
            return null;
        }
    }
}
