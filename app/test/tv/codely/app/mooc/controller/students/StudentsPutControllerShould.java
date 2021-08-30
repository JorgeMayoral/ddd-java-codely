package tv.codely.app.mooc.controller.students;

import org.junit.jupiter.api.Test;
import tv.codely.app.mooc.controller.RequestTestCase;

class StudentsPutControllerShould extends RequestTestCase {
    @Test
    void create_a_valid_non_existing_student() throws Exception {
        this.assertRequestWithBody(
            "PUT",
            "/students/2ae530bc-a942-4ef9-abe1-4cde92d21520",
            "{\"name\": \"The best student\", \"email\": \"thebeststudent@email.com\"}",
            201
        );
    }
}
