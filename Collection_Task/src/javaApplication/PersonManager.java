package javaApplication;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonManager {
    private Set<Person> hashSet = new HashSet<>();
    private Set<Person> linkedHashSet = new LinkedHashSet<>();

    public boolean addPersonToHashSet(Person person) {
        return hashSet.add(person);
    }

    public boolean addPersonToLinkedHashSet(Person person) {
        return linkedHashSet.add(person);
    }

    public Set<Person> getHashSet() {
        return hashSet;
    }

    public Set<Person> getLinkedHashSet() {
        return linkedHashSet;
    }
}
