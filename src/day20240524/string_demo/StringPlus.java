package day20240524.string_demo;

import day20240508.practice.Algorithm;

public class StringPlus extends Algorithm {
    int count;

    public StringPlus(int count) {
        this.count = count;
    }

    @Override
    public void algorithm() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}
