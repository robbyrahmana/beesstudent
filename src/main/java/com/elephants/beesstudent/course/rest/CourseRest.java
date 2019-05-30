package com.elephants.beesstudent.course.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.course.model.Course;
import com.elephants.beesstudent.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseRest extends AbstractBaseRest<Course, String>
{

    @Autowired
    private CourseService courseService;
    
    @Override
    protected BaseService<Course, String> getService()
    {
        return courseService;
    }

}
