package tv.codely.app.mooc.controller.courses;

import org.junit.jupiter.api.Test;
import tv.codely.app.mooc.controller.RequestTestCase;

public final class CoursesPutControllerShould extends RequestTestCase {
    @Test
    void create_a_valid_non_existing_course() throws Exception {
        this.assertRequestWithBody(
            "PUT",
            "/courses/2ae530bc-a942-4ef9-abe1-4cde92d21520",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
