package com.elephants.beesstudent.gradestudy.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseCRUDRepository;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;

@Repository
public interface GradeStudyRepository extends BaseCRUDRepository<GradeStudy, String>
{

}
