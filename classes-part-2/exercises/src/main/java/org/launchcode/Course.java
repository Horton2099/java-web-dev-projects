package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {

        String courseReport = String.format("Class Topic: %s \nInstructor: %s \nNumber of Students: %d", this.topic, this.instructor, this.enrolledStudents.size());
        return courseReport;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toTest) {

        if (toTest == this) {
            return true;
        }
        if (toTest == null) {
            return false;
        }
        if (toTest.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) toTest;
        return theCourse.getTopic() == getTopic();
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
