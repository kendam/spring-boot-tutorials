package com.tiidelab.school.models;


import javax.persistence.*;
import java.util.List;


@Entity(name = "lecturers")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name =  "first_name")
    private String firstName;
    @Column(name =  "last_name")
    private String lastName;
    private String email;
    private String phone;


   @ManyToMany
   @JoinTable(
           name="lecturer_subjects",
           joinColumns = @JoinColumn(name = "lecturer_id"),
           inverseJoinColumns = @JoinColumn( name = "subject_id")
         )
    private List<Subject> subjects;


    public Lecturer() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

}
