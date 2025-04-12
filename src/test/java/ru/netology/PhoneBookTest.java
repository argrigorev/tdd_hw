package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook pb = new PhoneBook();
        int result = pb.add("Ivan", 12345);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook pb = new PhoneBook();

        pb.add("Ivan", 12345);
        pb.add("Artem", 54321);

        Assertions.assertEquals("Ivan", pb.findByNumber(12345));
        Assertions.assertEquals("Artem", pb.findByNumber(54321));
    }

}
