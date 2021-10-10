package com.flieger.example.collatzconjecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/collatz")
public class CollatzConjectureController {
    private final CollatzConjectureService collatzConjectureService;

    @Autowired
    public CollatzConjectureController(CollatzConjectureService collatzConjectureService) {
        this.collatzConjectureService = collatzConjectureService;
    }

    @GetMapping
    public CollatzConjecture getIterations(@RequestParam(name = "startingnumber", defaultValue = "10") int startingNumber) {
        return this.collatzConjectureService.getIterations(startingNumber);
    }
}
