package day20240525.string_demo;

import day20240508.practice.Algorithm;

public class StringPlus extends SubAlgorithm {

    public StringPlus(int count) {
        super(count);
    }

    @Override
    public void algorithm() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}
