package tv.codely.app.mooc.controller.students;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.students.application.create.CreateStudentRequest;
import tv.codely.mooc.students.application.create.StudentCreator;

@RestController
public final class StudentsPutController {
    private final StudentCreator creator;

    public StudentsPutController(StudentCreator creator) {
        this.creator = creator;
    }

    @PutMapping(value = "/students/{id}")
    public ResponseEntity index(@PathVariable String id, @RequestBody tv.codely.app.mooc.controller.students.Request request) {
        this.creator.create(new CreateStudentRequest(id, request.name(), request.email()));

        return new ResponseEntity(HttpStatus.CREATED);
    }
}

final class Request {
    private String name;
    private String email;

    String name() {
        return name;
    }

    String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
