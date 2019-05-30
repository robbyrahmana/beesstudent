package com.elephants.beesstudent.study.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseCRUDRepository;
import com.elephants.beesstudent.study.model.Study;

@Repository
public interface StudyRepository extends BaseCRUDRepository<Study, String>
{

}
