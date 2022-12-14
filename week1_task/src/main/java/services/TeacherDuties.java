package services;

import models.Courses;
import models.Staff;

public interface TeacherDuties {
    public String teacherCanTeachACourse(String classes, Courses course, Staff teacher);
}
