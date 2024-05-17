package ir.mobin.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students", schema = "test")
public class Student {
    @Id
    @Column(name = "Student_id")
    private int id;

    @Column(name = "Student_name")
    private String name;


    /* Constructors */
    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /* GETTER & SETTERS*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
