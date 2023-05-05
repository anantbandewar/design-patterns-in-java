package io.infinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void createSingletonClassInstances() {
        Singleton instance1 = Singleton.getInstance("One");
        Singleton instance2 = Singleton.getInstance("Two");

        assertEquals(instance1.value, instance2.value);
        assertSame(instance1, instance2);
    }

    @Test
    void createSingletonClassInstancesUsingThreads() {
        One one = new One();
        Two two = new Two();

        Thread thread1 = new Thread(one);
        Thread thread2 = new Thread(two);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(one.instance.value, two.instance.value);
        assertSame(one.instance, two.instance);
    }


    static class One implements Runnable {
        public Singleton instance;

        @Override
        public void run() {
            instance = Singleton.getInstance("One");
        }
    }

    static class Two implements Runnable {
        Singleton instance;

        @Override
        public void run() {
            instance = Singleton.getInstance("Two");
        }
    }
}