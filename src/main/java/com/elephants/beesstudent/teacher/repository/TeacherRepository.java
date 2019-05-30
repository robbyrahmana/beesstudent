package com.elephants.beesstudent.teacher.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseCRUDRepository;
import com.elephants.beesstudent.teacher.model.Teacher;

@Repository
public interface TeacherRepository extends BaseCRUDRepository<Teacher, String>
{

}
