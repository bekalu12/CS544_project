package sample.project.studentservice.project.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
;
import java.util.List;

@Entity
public class Faculty {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate hiringDate;
    private int room;
    @ManyToMany(mappedBy = "faculties", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Course> courses ;
<<<<<<< HEAD

    @OneToOne //(cascade = CascadeType.ALL)
=======
    @OneToOne
    @JsonIgnore
>>>>>>> 8cbd8788eea2f9ffb206b0002d317e107f553503
    private Address address;

    public Faculty() {
    }

    public Faculty(String name, LocalDate hiringDate, int room, Address address) {
        this.name = name;
        this.hiringDate = hiringDate;
        this.room = room;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
