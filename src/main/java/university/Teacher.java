package university;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity(name = "teachers")
public class Teacher extends Person{
    private String email;
    @Column(name = "salary_per_hour")
    private Double salaryPerHour;
    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;
}
