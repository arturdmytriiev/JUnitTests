package org.example.junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SumServiceTest {
    @Autowired
    SumService sum;
    @Test
    void testSum() {
    assertEquals(2,sum.add(1,1));
    }

    @Test
    void testMultiply() {
    assertEquals(3,sum.multiply(3,1));
    }

}
