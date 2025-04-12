package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook pb = new PhoneBook();

        int result = pb.add("Ivan", 12345);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook pb = new PhoneBook();

        pb.add("Ivan", 12345);
        pb.add("Artem", 54321);

        Assertions.assertEquals("Ivan", pb.findByNumber(12345));
        Assertions.assertEquals("Artem", pb.findByNumber(54321));
    }

    @Test
    public void testFindByName() {
        PhoneBook pb = new PhoneBook();

        pb.add("Ivan", 12345);
        pb.add("Artem", 67890);

        Assertions.assertEquals(12345, pb.findByName("Ivan"));
        Assertions.assertEquals(67890, pb.findByName("Artem"));
    }

}
