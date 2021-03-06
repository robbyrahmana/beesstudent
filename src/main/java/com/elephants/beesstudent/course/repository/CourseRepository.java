package com.elephants.beesstudent.course.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.course.model.Course;

@Repository
public interface CourseRepository extends BaseRepository<Course, String>
{

}
