package com.elephants.beesstudent.curriculum.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.curriculum.model.Curriculum;

@Repository
public interface CurriculumRepository extends BaseRepository<Curriculum, String>
{

}
