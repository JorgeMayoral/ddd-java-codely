package tv.codely.mooc.students.infrastructure.persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentEmail;
import tv.codely.mooc.students.domain.StudentId;
import tv.codely.mooc.students.domain.StudentName;

import java.util.Optional;

final class InMemoryStudentRepositoryShould {
    @Test
    void save_a_valid_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Student student = new Student(new StudentId("cbdcb661-90ec-4f13-a0c8-273c91cf866c"), new StudentName("some-name"), new StudentEmail("some-email"));

        repository.save(student);
    }

    @Test
    void search_an_existing_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Student student = new Student(new StudentId("cbdcb661-90ec-4f13-a0c8-273c91cf866c"), new StudentName("some-name"), new StudentEmail("some-email"));

        repository.save(student);

        Assertions.assertEquals(Optional.of(student), repository.search(student.id()));
    }

    @Test
    void not_find_a_non_existing_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Assertions.assertFalse(repository.search(new StudentId("bca5e7c3-108c-4414-a79b-5aec2220b23b")).isPresent());
    }
}
