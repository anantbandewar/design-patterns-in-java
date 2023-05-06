package io.infinity;

import io.infinity.laptops.Laptop;
import io.infinity.laptops.MacLaptop;
import io.infinity.laptops.WindowsLaptop;
import io.infinity.factory.Factory;
import io.infinity.factory.MacFactory;
import static org.junit.jupiter.api.Assertions.*;

import io.infinity.factory.WindowsFactory;
import org.junit.jupiter.api.Test;

class DialogFactoryTest {

    Factory factory;

    @Test
    void createMacButton() {
        factory = new MacFactory();
        Laptop laptop = factory.manufactureLaptop();

        assertInstanceOf(MacLaptop.class, laptop, "MacFactory should produce mac products only.");
        assertEquals("MacBook", factory.produce(), "MacBook should be manufactured");
    }

    @Test
    void createWindowsButton() {
        factory = new WindowsFactory();
        Laptop laptop = factory.manufactureLaptop();

        assertInstanceOf(WindowsLaptop.class, laptop, "WindowsDialogFactory should produce windows products only.");
        assertEquals("NoteBook", factory.produce(), "NoteBook should be manufactured");
    }
}