package com.elephants.beesstudent.student.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.student.model.Student;

@Repository
public interface StudentRepository extends BaseRepository<Student, String>
{

}
