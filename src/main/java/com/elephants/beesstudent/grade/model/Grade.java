package com.elephants.beesstudent.grade.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tbl_grade")
public class Grade extends CommonModel
{
    @Column(length = 25, unique = true)
    private String grade;

    @JsonManagedReference
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
    private Set<GradeStudy> gradestudies;

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public Set<GradeStudy> getGradestudies()
    {
        return gradestudies;
    }

    public void setGradestudies(Set<GradeStudy> gradestudies)
    {
        this.gradestudies = gradestudies;
    }

    @Override
    public String toString()
    {
        return "Grade [grade=" + grade + ", gradestudies=" + gradestudies + ", getId()=" + getId() + ", isDeleted()="
            + isDeleted() + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()="
            + getLastModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()="
            + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
