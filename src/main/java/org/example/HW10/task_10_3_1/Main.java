package org.example.HW10.task_10_3_1;

public class Main {
    public static void main(String[] args) {
        Printable decorated = new PostEndlDecorator(                      // \n
                new PostSpaceDecorator(                                       // ' '
                        new PostExclaimDecorator(                                 // !
                                new PostWordDecorator(                                // "World"
                                       new PostSpaceDecorator(
                                        new PostComaDecorator(                            // ,
                                                new PreWordDecorator(                         // "Hello"
                                                        new PrintableString(""),                 // (порожня основа)
                                                        "Hello"
                                                )
                                        )
                                       ),
                                        "World"
                                )
                        )
                )
        );

        decorated.print();  // Виведе: Hello,World! \n
    }
}

