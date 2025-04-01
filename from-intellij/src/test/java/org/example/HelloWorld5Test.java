package org.example;

import org.example.intellij.HelloFromJetBrains;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//Test con Junit5
public class HelloWorld5Test {
    //@Disabled
    @Test
    void getHello5() {
        HelloFromJetBrains helloWorld = new HelloFromJetBrains();

        assert ("Hello from JetBrains").equals(helloWorld.Hello());
        System.out.println("Test con JUnit5 del modulo from-entities");
    }
}
