package io.infinity.factory;

import io.infinity.laptops.Laptop;

public abstract class Factory {

    public String produce() {
        Laptop laptop = manufactureLaptop();
        return laptop.manufacture();
    }

    public abstract Laptop manufactureLaptop();
}
