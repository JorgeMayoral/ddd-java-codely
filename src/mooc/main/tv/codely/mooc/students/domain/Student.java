package tv.codely.mooc.students.domain;

import java.util.Objects;

public final class Student {
    private final StudentId id;
    private final StudentName name;
    private final StudentEmail email;

    public Student(StudentId id, StudentName name, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentId id() {
        return id;
    }

    public StudentName name() {
        return name;
    }

    public StudentEmail email() {
        return email;
    }
}
