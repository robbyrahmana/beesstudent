package com.elephants.beesstudent.course.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.curriculum.model.Curriculum;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;
import com.elephants.beesstudent.student.model.Student;
import com.elephants.beesstudent.teacher.model.Teacher;

@Entity
@Table(name = "tbl_course")
public class Course extends CommonModel
{
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;
    
    @ManyToOne
    @JoinColumn(name = "grade_study_id")
    private GradeStudy gradeStudy;

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    public Curriculum getCurriculum()
    {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum)
    {
        this.curriculum = curriculum;
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
        return "Course [teacher=" + teacher + ", student=" + student + ", curriculum=" + curriculum + ", gradeStudy="
            + gradeStudy + ", getId()=" + getId() + ", isDeleted()=" + isDeleted() + ", getCreatedDate()="
            + getCreatedDate() + ", getLastModifiedDate()=" + getLastModifiedDate() + ", getCreatedBy()="
            + getCreatedBy() + ", getLastModifiedBy()=" + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
