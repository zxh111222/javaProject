package day20240524.string_demo;

import day20240508.practice.Algorithm;

public class StringBufferAppend extends Algorithm {
    int count;

    public StringBufferAppend(int count) {
        this.count = count;
    }


    @Override
    public void algorithm() {
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i);
        }
    }
}
