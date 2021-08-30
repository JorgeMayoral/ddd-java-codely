package tv.codely.mooc.students.infrastructure.persistence;

import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentId;
import tv.codely.mooc.students.domain.StudentRepository;

import java.util.HashMap;
import java.util.Optional;

public final class InMemoryStudentRepository implements StudentRepository {
    private HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        students.put(student.id().value(), student);
    }

    public Optional<Student> search(StudentId id) {
        return Optional.ofNullable(students.get(id.value()));
    }
}
