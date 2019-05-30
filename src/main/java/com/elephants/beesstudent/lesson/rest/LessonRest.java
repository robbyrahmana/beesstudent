package com.elephants.beesstudent.lesson.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.lesson.model.Lesson;
import com.elephants.beesstudent.lesson.service.LessonService;

@RestController
@RequestMapping("/lesson")
public class LessonRest extends AbstractBaseRest<Lesson, String>
{
    
    @Autowired
    private LessonService lessonService;
    @Override
    protected BaseService<Lesson, String> getService()
    {
        return lessonService;
    }

}
