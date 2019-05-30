package com.elephants.beesstudent.student.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.grade.model.Grade;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tbl_student")
public class Student extends CommonModel
{
    private String name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Grade getGrade()
    {
        return grade;
    }

    public void setGrade(Grade grade)
    {
        this.grade = grade;
    }

    public Grade getStudentGrade()
    {   
        Grade grade = new Grade();
        if (this.grade != null) {
            grade.setId(this.grade.getId());
            grade.setGrade(this.grade.getGrade());
        }
        return grade;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", grade=" + grade + ", getId()=" + getId() + ", isDeleted()=" + isDeleted()
            + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()=" + getLastModifiedDate()
            + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()=" + getLastModifiedBy() + ", getVersion()="
            + getVersion() + "]";
    }
}
