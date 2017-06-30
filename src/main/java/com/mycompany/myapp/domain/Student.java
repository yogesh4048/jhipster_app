package com.mycompany.myapp.domain;

import com.datastax.driver.mapping.annotations.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * A Student.
 */
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @PartitionKey
    private UUID id;

    @NotNull
    private String name;

    private String email;

    private Integer phone;

    private LocalDate joiningdate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Student email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public Student phone(Integer phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public LocalDate getJoiningdate() {
        return joiningdate;
    }

    public Student joiningdate(LocalDate joiningdate) {
        this.joiningdate = joiningdate;
        return this;
    }

    public void setJoiningdate(LocalDate joiningdate) {
        this.joiningdate = joiningdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (student.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", joiningdate='" + getJoiningdate() + "'" +
            "}";
    }
}
