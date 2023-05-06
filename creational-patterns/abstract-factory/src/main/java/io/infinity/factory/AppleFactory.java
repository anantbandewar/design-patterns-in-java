package io.infinity.factory;

import io.infinity.products.keyboard.AppleKeyboard;
import io.infinity.products.keyboard.Keyboard;
import io.infinity.products.laptop.AppleLaptop;
import io.infinity.products.laptop.Laptop;
import io.infinity.products.mouse.AppleMouse;
import io.infinity.products.mouse.Mouse;

public class AppleFactory implements Factory {
    @Override
    public Laptop manufactureLaptop() {
        return new AppleLaptop();
    }

    @Override
    public Keyboard manufactureKeyboard() {
        return new AppleKeyboard();
    }

    @Override
    public Mouse manufactureMouse() {
        return new AppleMouse();
    }
}
