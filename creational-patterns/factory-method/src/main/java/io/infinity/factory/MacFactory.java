package io.infinity.factory;

import io.infinity.laptops.Laptop;
import io.infinity.laptops.MacLaptop;

public class MacFactory extends Factory {

    @Override
    public Laptop manufactureLaptop() {
        return new MacLaptop();
    }
}
