package tv.codely.mooc.courses;

import tv.codely.mooc.courses.infrastructure.persistence.InMemoryCourseRepository;
import tv.codely.shared.infrastructure.InfrastructureTestCase;

public final class CoursesModuleInfrastructureTestCase extends InfrastructureTestCase {
    protected InMemoryCourseRepository repository = new InMemoryCourseRepository();
}
