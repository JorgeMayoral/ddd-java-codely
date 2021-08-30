package tv.codely.mooc.students.infrastructure.persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.domain.*;

import java.util.Optional;

final class InMemoryStudentRepositoryShould {
    @Test
    void save_a_valid_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Student student = StudentMother.random();

        repository.save(student);
    }

    @Test
    void search_an_existing_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Student student = StudentMother.random();

        repository.save(student);

        Assertions.assertEquals(Optional.of(student), repository.search(student.id()));
    }

    @Test
    void not_find_a_non_existing_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        Assertions.assertFalse(repository.search(StudentIdMother.random()).isPresent());
    }
}
