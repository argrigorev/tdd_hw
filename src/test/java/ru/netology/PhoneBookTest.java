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

}
