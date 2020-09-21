package sample.project.studentservice.project.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String name;
    private int studentId;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private double GPA;

    @OneToOne
    private Address address;

//    @OneToMany
//    private List<Course> courses ;


    //private List<Faculty> faculties = new ArrayList<>();

    @ManyToMany
    private List<Student> ta ;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "student")
    private List<CoursesRegistered> coursesRegisteredList;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }

    public List<Student> getTa() {
        return ta;
    }

    public void setTa(List<Student> ta) {
        this.ta = ta;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<CoursesRegistered> getCoursesRegisteredList() {
        return coursesRegisteredList;
    }

    public void setCoursesRegisteredList(List<CoursesRegistered> coursesRegisteredList) {
        this.coursesRegisteredList = coursesRegisteredList;
    }
}
