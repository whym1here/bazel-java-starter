package com.example;

import com.google.common.collect.ImmutableList;
import com.ebay.bascomtask.core.Orchestrator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Bazel!");
        System.out.println("Guava version: " + ImmutableList.of(1, 2, 3));
        
        // Just show we can access the class
        System.out.println("Orchestrator class loaded: " + Orchestrator.class);
    }
}