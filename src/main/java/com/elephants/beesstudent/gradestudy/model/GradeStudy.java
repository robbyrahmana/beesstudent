package com.elephants.beesstudent.gradestudy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.grade.model.Grade;
import com.elephants.beesstudent.lesson.model.Lesson;
import com.elephants.beesstudent.study.model.Study;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tbl_grade_study")
public class GradeStudy extends CommonModel
{
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "grade_id")
    Grade grade;

    @ManyToOne
    @JoinColumn(name = "study_id")
    Study study;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "gradeStudy", fetch = FetchType.LAZY)
    Set<Lesson> lessons;

    public Grade getGrade()
    {
        return grade;
    }

    public void setGrade(Grade grade)
    {
        this.grade = grade;
    }

    public Study getStudy()
    {
        return study;
    }

    public void setStudy(Study study)
    {
        this.study = study;
    }

    public Set<Lesson> getLessons()
    {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons)
    {
        this.lessons = lessons;
    }

    @Override
    public String toString()
    {
        return "GradeStudy [grade=" + grade + ", study=" + study + ", lessons=" + lessons + ", getId()=" + getId()
            + ", isDeleted()=" + isDeleted() + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()="
            + getLastModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()="
            + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
