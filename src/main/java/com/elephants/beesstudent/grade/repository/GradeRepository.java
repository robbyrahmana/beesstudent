package com.elephants.beesstudent.grade.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseCRUDRepository;
import com.elephants.beesstudent.grade.model.Grade;

@Repository
public interface GradeRepository extends BaseCRUDRepository<Grade, String>
{

}
