package com.elephants.beesstudent.teacher.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.teacher.model.Teacher;
import com.elephants.beesstudent.teacher.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherRest extends AbstractBaseRest<Teacher, String>
{

    @Autowired
    private TeacherService teacherService;
    
    @Override
    protected BaseService<Teacher, String> getService()
    {
        return teacherService;
    }

}
