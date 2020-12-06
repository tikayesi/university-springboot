package com.enigma.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mst_major")
public class Major {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name= "system-uuid", strategy = "uuid")
    @Column(name = "major_id")
    private String id;
    private String majorName;

    @OneToMany(mappedBy = "major", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("major")
    private List<Student> students= new ArrayList<>();

    public Major() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Major(String id, String majorName) {
        this.id = id;
        this.majorName = majorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
