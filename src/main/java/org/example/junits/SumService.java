package org.example.junits;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    public int add(int a, int b) {
        return a+b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
}
