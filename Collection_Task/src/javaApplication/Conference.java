package javaApplication;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Conference {
    private Set<Person> attendees = new HashSet<>();

    public boolean addAttendee(Person person) {
        return attendees.add(person);
    }

    public boolean removeAttendee(Person person) {
        return attendees.remove(person);
    }

    public Set<Person> findDuplicateAttendees() {
        Set<Person> duplicates = new HashSet<>();
        Set<Integer> ids = new HashSet<>();

        for (Person p : attendees) {
            if (!ids.add(p.getId())) {
                duplicates.add(p);
            }
        }

        return duplicates;
    }

    public Set<Person> listUniqueAttendees() {
        return new HashSet<>(attendees);
    }

    public Set<Person> findAttendeesInRange(int minAge, int maxAge) {
        return attendees.stream()
                .filter(p -> p.getAge() >= minAge && p.getAge() <= maxAge)
                .collect(Collectors.toSet());
    }
}

