package com.elephants.beesstudent.teacher.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;

@Entity
@Table(name = "tbl_teacher")
public class Teacher extends CommonModel
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Teacher [name=" + name + ", getId()=" + getId() + ", isDeleted()=" + isDeleted() + ", getCreatedDate()="
            + getCreatedDate() + ", getLastModifiedDate()=" + getLastModifiedDate() + ", getCreatedBy()="
            + getCreatedBy() + ", getLastModifiedBy()=" + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
