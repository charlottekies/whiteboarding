package com.beginner;

import org.junit.jupiter.api.Test;

public class PerformanceTests {

    @Test
    public void testFactorialPerformance() {
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int n = 20; // Adjust the input value for your test
        int repetitions = 1000; // Number of repetitions for the test
        long totalTime = 0;

        for (int i = 0; i < repetitions; i++) {
            long startTime = System.nanoTime();

            // Call the method you want to test
            int result = dynamicProgramming.calculateFactorial(n);

            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;

            totalTime += elapsedTime;
        }

        long averageTime = totalTime / repetitions;
        System.out.println("Average Execution Time: " + averageTime + " nanoseconds");
    }
}
