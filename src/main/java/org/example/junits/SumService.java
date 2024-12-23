package org.example.junits;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public int multiply(int a, int b) {
        int result = a*b;
        return result;
    }
}
