package com.elephants.beesstudent.curriculum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.elephants.beesstudent.base.model.CommonModel;

@Entity
@Table(name = "tbl_curriculum")
public class Curriculum extends CommonModel
{
    @Column(length = 10, unique = true)
    private String code;

    @Column(length = 20, unique = true)
    private String name;

    private String description;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "Curriculum [code=" + code + ", name=" + name + ", description=" + description + ", getId()=" + getId()
            + ", isDeleted()=" + isDeleted() + ", getCreatedDate()=" + getCreatedDate() + ", getLastModifiedDate()="
            + getLastModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getLastModifiedBy()="
            + getLastModifiedBy() + ", getVersion()=" + getVersion() + "]";
    }
}
