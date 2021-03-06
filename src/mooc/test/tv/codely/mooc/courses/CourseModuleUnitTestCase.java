package tv.codely.mooc.courses;

import org.junit.jupiter.api.BeforeEach;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.shared.infrastructure.UnitTestCase;

import static org.mockito.Mockito.*;

public abstract class CourseModuleUnitTestCase extends UnitTestCase {
    protected CourseRepository repository;

    @BeforeEach
    protected void setUp() {
        repository = mock(CourseRepository.class);
    }

    protected void shouldHaveSaved(Course course) {
        verify(repository, atLeastOnce()).save(course);
    }
}
