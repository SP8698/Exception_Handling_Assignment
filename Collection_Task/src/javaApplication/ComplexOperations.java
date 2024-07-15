package javaApplication;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComplexOperations {
    public static void main(String[] args) {
        PersonManager manager = new PersonManager();

        Person p1 = new Person(1, "Saurabh", 30);
        Person p2 = new Person(2, "Nikhil", 25);
        Person p3 = new Person(3, "Shreerang", 35);

        manager.addPersonToHashSet(p1);
        manager.addPersonToHashSet(p2);
        manager.addPersonToHashSet(p3);

        manager.addPersonToLinkedHashSet(p1);
        manager.addPersonToLinkedHashSet(p2);
        manager.addPersonToLinkedHashSet(p3);

        Set<Person> hashSet = manager.getHashSet();
        
        Person maxAgePerson = hashSet.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
        Person minAgePerson = hashSet.stream().min(Comparator.comparingInt(Person::getAge)).orElse(null);
        System.out.println("Max age person in HashSet: " + maxAgePerson);
        System.out.println("Min age person in HashSet: " + minAgePerson);

        
        List<Person> sortedByAge = hashSet.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        System.out.println("Sorted by age in HashSet: " + sortedByAge);

        
        Set<Person> filteredByAge = filterByAge(hashSet, 30);
        System.out.println("Filtered by age > 30 in HashSet: " + filteredByAge);
    }

    public static Set<Person> filterByAge(Set<Person> persons, int age) {
        return persons.stream().filter(p -> p.getAge() > age).collect(Collectors.toSet());
    }
}

