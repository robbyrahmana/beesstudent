package com.elephants.beesstudent.grade.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.grade.model.Grade;
import com.elephants.beesstudent.grade.service.GradeService;

@RestController
@RequestMapping("/grade")
public class GradeRest extends AbstractBaseRest<Grade, String>
{
    
    @Autowired
    private GradeService gradeService;
    
    @Override
    protected BaseService<Grade, String> getService()
    {
        return gradeService;
    }

}
