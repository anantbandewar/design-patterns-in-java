package io.infinity.factory;

import io.infinity.products.keyboard.AppleKeyboard;
import io.infinity.products.keyboard.Keyboard;
import io.infinity.products.keyboard.LenovoKeyboard;
import io.infinity.products.laptop.AppleLaptop;
import io.infinity.products.laptop.Laptop;
import io.infinity.products.laptop.LenovoLaptop;
import io.infinity.products.mouse.AppleMouse;
import io.infinity.products.mouse.LenovoMouse;
import io.infinity.products.mouse.Mouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    Factory factory;

    @Test
    void produceAppleProducts() {
        factory = new AppleFactory();

        Laptop laptop = factory.manufactureLaptop();
        Keyboard keyboard = factory.manufactureKeyboard();
        Mouse mouse = factory.manufactureMouse();

        assertInstanceOf(AppleLaptop.class, laptop, "Apple factory should produce apple laptop.");
        assertEquals("MacBook", laptop.manufacture(), "Apple factory should manufacture MacBook.");

        assertInstanceOf(AppleKeyboard.class, keyboard, "Apple factory should manufacture apple keyboard.");
        assertEquals("AppleKey", keyboard.pressKey(), "Apple key should be pressed.");

        assertInstanceOf(AppleMouse.class, mouse, "Apple factory should produce apple keyboard.");
        assertEquals("AppleMouse", mouse.move(), "Apple mouse should be moved.");
    }

    @Test
    void produceLenovoProducts() {
        factory = new LenovoFactory();

        Laptop laptop = factory.manufactureLaptop();
        Keyboard keyboard = factory.manufactureKeyboard();
        Mouse mouse = factory.manufactureMouse();

        assertInstanceOf(LenovoLaptop.class, laptop, "Lenovo factory should produce lenovo laptop.");
        assertEquals("NoteBook", laptop.manufacture(), "Lenovo factory should manufacture NoteBook.");

        assertInstanceOf(LenovoKeyboard.class, keyboard, "Lenovo factory should manufacture lenovo keyboard.");
        assertEquals("LenovoKey", keyboard.pressKey(), "Lenovo key should be pressed.");

        assertInstanceOf(LenovoMouse.class, mouse, "Lenovo factory should produce lenovo keyboard.");
        assertEquals("LenovoMouse", mouse.move(), "Lenovo mouse should be moved.");
    }

}