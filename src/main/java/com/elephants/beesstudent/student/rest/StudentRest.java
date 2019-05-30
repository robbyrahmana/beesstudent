package com.elephants.beesstudent.student.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.student.model.Student;
import com.elephants.beesstudent.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentRest extends AbstractBaseRest<Student, String>
{
    
    @Autowired
    private StudentService studentService;
    
    @Override
    protected BaseService<Student, String> getService()
    {
        return studentService;
    }

}
