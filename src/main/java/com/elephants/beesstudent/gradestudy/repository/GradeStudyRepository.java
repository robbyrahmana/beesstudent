package com.elephants.beesstudent.gradestudy.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;

@Repository
public interface GradeStudyRepository extends BaseRepository<GradeStudy, String>
{

}
