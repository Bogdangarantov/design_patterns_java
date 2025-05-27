package org.example.HW4.task_4_3_2;

public class Main {
    public static void main(String[] args) {
        String result = new StringBuilderCustom()
                .append("Hello")
                .append(" World")
                .insert(5, ",")
                .build();

        System.out.println(result); // Hello, World
    }
}
