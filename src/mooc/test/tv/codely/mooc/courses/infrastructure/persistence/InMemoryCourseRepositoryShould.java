package tv.codely.mooc.courses.infrastructure.persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseIdMother;
import tv.codely.mooc.courses.domain.CourseMother;

import java.util.Optional;

final class InMemoryCourseRepositoryShould {
    @Test
    void save_a_valid_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        Course course = CourseMother.random();

        repository.save(course);
    }

    @Test
    void search_an_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        Course course = CourseMother.random();

        repository.save(course);

        Assertions.assertEquals(Optional.of(course), repository.search(course.id()));
    }

    @Test
    void not_find_a_non_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        Assertions.assertFalse(repository.search(CourseIdMother.random()).isPresent());
    }
}
