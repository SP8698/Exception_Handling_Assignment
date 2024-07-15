package javaApplication;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        PersonManager manager = new PersonManager();

        Person p1 = new Person(1, "Saurabh", 30);
        Person p2 = new Person(2, "Pranav", 25);
        Person p3 = new Person(3, "Shreerang", 35);
        Person p4 = new Person(1, "Shreerang", 30); 

        manager.addPersonToHashSet(p1);
        manager.addPersonToHashSet(p2);
        manager.addPersonToHashSet(p3);
        manager.addPersonToHashSet(p4); 

        manager.addPersonToLinkedHashSet(p1);
        manager.addPersonToLinkedHashSet(p2);
        manager.addPersonToLinkedHashSet(p3);
        manager.addPersonToLinkedHashSet(p4); 

        Set<Person> hashSet = manager.getHashSet();
        Set<Person> linkedHashSet = manager.getLinkedHashSet();

       
        Set<Person> union = new HashSet<>(hashSet);
        union.addAll(linkedHashSet);
        System.out.println("Union: " + union);

       
        Set<Person> intersection = new HashSet<>(hashSet);
        intersection.retainAll(linkedHashSet);
        System.out.println("Intersection: " + intersection);

        
        Set<Person> difference1 = new HashSet<>(hashSet);
        difference1.removeAll(linkedHashSet);
        System.out.println("Difference (HashSet - LinkedHashSet): " + difference1);

        Set<Person> difference2 = new HashSet<>(linkedHashSet);
        difference2.removeAll(hashSet);
        System.out.println("Difference (LinkedHashSet - HashSet): " + difference2);
    }
}
