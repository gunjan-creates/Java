package Collections;

import java.util.*;

/**
 * Demonstrates various sorting techniques in Java Collections using
 * Comparable and Comparator interfaces.
 */
public class SortingExample {
    // Example class implementing Comparable
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        @Override
        public int compareTo(Person other) {
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return String.format("%s (age: %d)", name, age);
        }
    }

    // Example class that will use external Comparators
    static class Student {
        private String name;
        private double gpa;
        private String major;

        public Student(String name, double gpa, String major) {
            this.name = name;
            this.gpa = gpa;
            this.major = major;
        }

        public String getName() { return name; }
        public double getGpa() { return gpa; }
        public String getMajor() { return major; }

        @Override
        public String toString() {
            return String.format("%s (GPA: %.2f, Major: %s)", name, gpa, major);
        }
    }

    public static void main(String[] args) {
        // 1. Natural ordering with Comparable
        List<Person> people = new ArrayList<>(Arrays.asList(
            new Person("Charlie", 30),
            new Person("Alice", 25),
            new Person("Bob", 35),
            new Person("Diana", 28)
        ));

        System.out.println("People before sorting:");
        people.forEach(System.out::println);

        Collections.sort(people);  // Uses Person's compareTo method
        
        System.out.println("\nPeople after sorting by name (natural order):");
        people.forEach(System.out::println);

        // 2. Custom Comparator - sort by age
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        
        System.out.println("\nPeople sorted by age:");
        people.forEach(System.out::println);

        // 3. Multiple comparators with Student objects
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Eve", 3.8, "Physics"),
            new Student("Frank", 3.9, "Chemistry"),
            new Student("Grace", 3.7, "Physics"),
            new Student("Henry", 4.0, "Mathematics"),
            new Student("Ivy", 3.9, "Chemistry")
        ));

        // Sort by GPA (descending)
        Comparator<Student> byGPA = Comparator.comparingDouble(Student::getGpa).reversed();
        
        Collections.sort(students, byGPA);
        System.out.println("\nStudents sorted by GPA (descending):");
        students.forEach(System.out::println);

        // Sort by major, then by GPA (descending), then by name
        Comparator<Student> byMajorThenGPAThenName = Comparator
            .comparing(Student::getMajor)
            .thenComparing(Student::getGpa, Comparator.reverseOrder())
            .thenComparing(Student::getName);

        Collections.sort(students, byMajorThenGPAThenName);
        System.out.println("\nStudents sorted by major, then GPA (desc), then name:");
        students.forEach(System.out::println);

        // 4. Using Java 8 streams with sorting
        System.out.println("\nTop 3 students by GPA:");
        students.stream()
               .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
               .limit(3)
               .forEach(System.out::println);

        // 5. Case-insensitive sorting
        List<String> names = Arrays.asList("alice", "Bob", "CHARLIE", "Diana");
        System.out.println("\nNames before case-insensitive sort: " + names);
        
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Names after case-insensitive sort: " + names);

        // 6. Sorting with nulls (null-safe comparator)
        List<String> withNulls = new ArrayList<>(Arrays.asList("Z", null, "A", null, "M"));
        System.out.println("\nList with nulls before sorting: " + withNulls);
        
        Collections.sort(withNulls, Comparator.nullsLast(String::compareTo));
        System.out.println("List with nulls after sorting (nulls last): " + withNulls);
    }
}