package university;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity(name = "students")
public class Student extends Person{
    @Column(name = "average_grade")
    private Double averageGrade;
    private Double attendance;
    @ManyToMany(mappedBy = "students")
    private Set<Course> courses;

    public Student() {
    }
}
