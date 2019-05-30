package com.elephants.beesstudent.grade.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.grade.model.Grade;

@Repository
public interface GradeRepository extends BaseRepository<Grade, String>
{

}
