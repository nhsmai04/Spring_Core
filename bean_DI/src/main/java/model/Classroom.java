package model;


import java.util.List;
import java.util.Properties;

public class Classroom {
    private Student student;
    private List<Student> studentList;
    private Properties classProps;

    public void setStudent(Student student){
        this.student = student;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    public void setClassProps(Properties classProps){
        this.classProps = classProps;
    }

    public void show(){
        if (student != null) student.show();

        if (studentList != null) {
            System.out.println("Students in list:");
            for (Student s : studentList) {
                s.show();
            }
        }

        if (classProps != null) {
            System.out.println("Class Properties:");
            classProps.forEach((k, v) -> System.out.println(k + " : " + v));
        }
    }
}
