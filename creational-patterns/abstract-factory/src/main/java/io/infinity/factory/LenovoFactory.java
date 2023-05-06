package io.infinity.factory;

import io.infinity.products.keyboard.Keyboard;
import io.infinity.products.keyboard.LenovoKeyboard;
import io.infinity.products.laptop.Laptop;
import io.infinity.products.laptop.LenovoLaptop;
import io.infinity.products.mouse.LenovoMouse;
import io.infinity.products.mouse.Mouse;

public class LenovoFactory implements Factory {
    @Override
    public Laptop manufactureLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public Keyboard manufactureKeyboard() {
        return new LenovoKeyboard();
    }

    @Override
    public Mouse manufactureMouse() {
        return new LenovoMouse();
    }
}
