package io.infinity.factory;

import io.infinity.laptops.Laptop;
import io.infinity.laptops.WindowsLaptop;

public class WindowsFactory extends Factory {

    @Override
    public Laptop manufactureLaptop() {
        return new WindowsLaptop();
    }
}
