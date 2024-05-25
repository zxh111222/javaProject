package day20240525.string_demo;

import day20240508.practice.Algorithm;

public class StringBuilderAppend extends SubAlgorithm {

    int count;

    public StringBuilderAppend(int count) {
        super(count);
    }


    @Override
    public void algorithm() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }
    }

}
