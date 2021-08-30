package tv.codely.mooc.students.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.domain.*;

import static org.mockito.Mockito.*;

class StudentCreatorShould {
    @Test
    void create_a_valid_student() {
        StudentRepository repository = mock(StudentRepository.class);
        StudentCreator creator = new StudentCreator(repository);

        String id = "12f41915-0828-48d3-9a26-bd1ef79ed6a4";
        String name = "some-name";
        String email = "some-email";

        CreateStudentRequest request = new CreateStudentRequest(id, name, email);

        Student student = new Student(new StudentId(request.id()), new StudentName(request.name()), new StudentEmail(request.email()));

        creator.create(request);

        verify(repository, atLeastOnce()).save(student);
    }
}
