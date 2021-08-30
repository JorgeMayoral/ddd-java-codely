package tv.codely.mooc.students;

import tv.codely.mooc.students.infrastructure.persistence.InMemoryStudentRepository;
import tv.codely.shared.infrastructure.InfrastructureTestCase;

public final class StudentsModuleInfrastructureTestCase extends InfrastructureTestCase {
    protected InMemoryStudentRepository repository = new InMemoryStudentRepository();
}
