package day20240525.string_demo;


public class MyStringBuilder {

    char[] value;

    int count;

    public MyStringBuilder() {
        value = new char[16];
    }

    public MyStringBuilder(int capacity) {
        value = new char[capacity];
    }

    public MyStringBuilder(String str) {
        value = new char[str.length() + count];
        append(str);
    }

    public MyStringBuilder append(String str) {
        if (str == null)
            return append("null");
        int len = str.length();
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            str.append(value[i]);
        }
        return str.toString();
    }
}
