package org.example.junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumServiceTest {
    @Autowired
    SumService sum;
    @Test
    void testSum() {
    Assertions.assertEquals(2,sum.add(1,1));
    }
    
    @Test
    void testMultiply() {
    Assertions.assertEquals(3,sum.multiply(1,3));
    }

}
