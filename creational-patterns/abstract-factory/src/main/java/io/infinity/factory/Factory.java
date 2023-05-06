package io.infinity.factory;

import io.infinity.products.keyboard.Keyboard;
import io.infinity.products.laptop.Laptop;
import io.infinity.products.mouse.Mouse;

public interface Factory {

    Laptop manufactureLaptop();

    Keyboard manufactureKeyboard();

    Mouse manufactureMouse();
}
