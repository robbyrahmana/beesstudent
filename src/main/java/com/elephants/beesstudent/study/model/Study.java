package com.elephants.beesstudent.study.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbl_study")
public class Study extends CommonModel
{
    @Column(length = 10, unique = true)
    private String study;

    @JsonIgnore
    @OneToMany(mappedBy = "study", fetch = FetchType.LAZY)
    private Set<GradeStudy> gradestudies;

    public String getStudy()
    {
        return study;
    }

    public void setStudy(String study)
    {
        this.study = study;
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
        return "Study [study=" + study + ", gradestudies=" + gradestudies + ", getId()=" + getId() + ", isDeleted()="
            + isDeleted() + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()="
            + getLastModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()="
            + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
