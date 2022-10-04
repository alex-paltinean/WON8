package org.fasttrackit.homework;

import java.util.List;

public class ReportGenerator {

    private final Classroom classroom;

    public ReportGenerator(List<StudentGrade> grades) {
        classroom = new Classroom(grades);
    }

    public void doSomething() {
        classroom.getGradesForDiscipline("");
    }


}
