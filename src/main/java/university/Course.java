package university;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(name = "start_date" , nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;
    @Column(nullable = false)
    private Integer credits;
    @ManyToMany
    private Set<Student> students;
    @ManyToOne
    private Teacher teacher;
}
