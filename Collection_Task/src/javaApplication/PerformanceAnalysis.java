package javaApplication;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerformanceAnalysis {
    public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();

        long startTime, endTime;

        // Measure add operation
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet add operation: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashSet.add(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add operation: " + (endTime - startTime) + " ns");

      
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove operation: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove operation: " + (endTime - startTime) + " ns");

        
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(new Person(i, "Person" + i, i % 100));
            linkedHashSet.add(new Person(i, "Person" + i, i % 100));
        }

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains operation: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains operation: " + (endTime - startTime) + " ns");
    }
}
