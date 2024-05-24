package day20240524.string_demo;

import day20240508.practice.Algorithm;

public class StringBuilderAppend extends Algorithm {

    int count;

    public StringBuilderAppend(int count) {
        this.count = count;
    }


    @Override
    public void algorithm() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }
    }

}
