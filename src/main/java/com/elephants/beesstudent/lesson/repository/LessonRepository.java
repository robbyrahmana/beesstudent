package com.elephants.beesstudent.lesson.repository;

import org.springframework.stereotype.Repository;

import com.elephants.beesstudent.base.repository.BaseRepository;
import com.elephants.beesstudent.lesson.model.Lesson;

@Repository
public interface LessonRepository extends BaseRepository<Lesson, String>
{

}
