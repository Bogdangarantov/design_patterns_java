package org.example.HW4.task_4_3_2;

public class StringBuilderCustom {
    private final StringBuilder builder = new StringBuilder();

    public StringBuilderCustom append(String str) {
        builder.append(str);
        return this;
    }

    public StringBuilderCustom insert(int index, String str) {
        builder.insert(index, str);
        return this;
    }

    public String build() {
        return builder.toString();
    }
}
