package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.CourseModuleUnitTestCase;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseMother;

final class CourseCreatorShould extends CourseModuleUnitTestCase {
    private CourseCreator creator;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        creator = new CourseCreator(repository);
    }

    @Test
    void create_a_valid_course() {
        CreateCourseRequest request = CreateCourseRequestMother.random();

        Course course = CourseMother.fromRequest(request);

        creator.create(request);

        shouldHaveSaved(course);
    }
}
