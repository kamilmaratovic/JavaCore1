package lesson11_Enums_toString;

import java.util.Arrays;

public class Student {
    private Subjects[] subjects;
    private String name;
    private Subjects major;

    public Student(Subjects[] subjects, String name, Subjects major) {
        this.subjects = subjects;
        this.name = name;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + Arrays.toString(subjects) +
                ", name='" + name + '\'' +
                ", major=" + major +
                '}';
    }
}
