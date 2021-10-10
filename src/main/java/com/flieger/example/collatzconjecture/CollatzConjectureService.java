package com.flieger.example.collatzconjecture;

import org.springframework.stereotype.Service;

@Service
public class CollatzConjectureService {
    
    public CollatzConjecture getIterations(int startingNumber) {
        return new CollatzConjecture(startingNumber);
    }
}
