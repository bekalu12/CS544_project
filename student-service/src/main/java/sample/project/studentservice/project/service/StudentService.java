package sample.project.studentservice.project.service;

import org.springframework.stereotype.Service;
import sample.project.studentservice.project.domain.Course;
import sample.project.studentservice.project.domain.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Course> getAllCoursebyStdentId(int id);

    List<Course> getRegisteredByStudentId(int id);

    List<Student> getAllStudents();

    public List<Course> getAllStudentCourses(int studentId);

    public void saveStudents(Student student);

    Student getStudentById(int studentId);

    Student putStudent(Student student, int id);

    void deleteStudentById(int studentId);
}
