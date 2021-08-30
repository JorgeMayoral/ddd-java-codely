package tv.codely.mooc.students.application.create;

import tv.codely.mooc.students.domain.*;

public final class CreateStudentRequestMother {
    public static CreateStudentRequest create(StudentId id, StudentName name, StudentEmail email) {
        return new CreateStudentRequest(id.value(), name.value(), email.value());
    }

    public static CreateStudentRequest random() {
        return create(StudentIdMother.random(), StudentNameMother.random(), StudentEmailMother.random());
    }
}
