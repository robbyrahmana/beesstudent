package com.elephants.beesstudent.lesson.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseCRUDRepository;
import com.elephants.beesstudent.lesson.model.Lesson;

@Repository
public interface LessonRepository extends BaseCRUDRepository<Lesson, String>
{

}
