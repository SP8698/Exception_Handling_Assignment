package javaApplication;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Conference conference = new Conference();

        Person p1 = new Person(1, "Saurabh", 30);
        Person p2 = new Person(2, "Pranav", 25);
        Person p3 = new Person(3, "Yash", 35);
        Person p4 = new Person(1, "Saurabh", 30); 

        conference.addAttendee(p1);
        conference.addAttendee(p2);
        conference.addAttendee(p3);
        conference.addAttendee(p4); 

        
        Set<Person> duplicates = conference.findDuplicateAttendees();
        System.out.println("Duplicate attendees: " + duplicates);

      
        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
        System.out.println("Unique attendees: " + uniqueAttendees);

       
        Set<Person> attendeesInRange = conference.findAttendeesInRange(25, 30);
        System.out.println("Attendees in age range 25-30: " + attendeesInRange);
    }
}
