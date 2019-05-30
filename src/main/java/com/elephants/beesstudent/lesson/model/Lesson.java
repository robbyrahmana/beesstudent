package com.elephants.beesstudent.lesson.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tbl_lesson")
public class Lesson extends CommonModel
{
    private String lesson;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "grade_study_id")
    private GradeStudy gradeStudy;

    public String getLesson()
    {
        return lesson;
    }

    public void setLesson(String lesson)
    {
        this.lesson = lesson;
    }

    public GradeStudy getGradeStudy()
    {
        return gradeStudy;
    }

    public void setGradeStudy(GradeStudy gradeStudy)
    {
        this.gradeStudy = gradeStudy;
    }

    @Override
    public String toString()
    {
        return "Lesson [lesson=" + lesson + ", gradeStudy=" + gradeStudy + ", getId()=" + getId() + ", isDeleted()="
            + isDeleted() + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()="
            + getLastModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()="
            + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
