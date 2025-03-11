package com.ron.bookingservice.Service;

@FunctionalInterface
public interface TestInterface {
    void sayHello();

    static void sayBye() {
        System.out.println("bye");
    }

    boolean equals(Object obj);
}
