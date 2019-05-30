package com.elephants.beesstudent.gradestudy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.gradestudy.model.GradeStudy;
import com.elephants.beesstudent.gradestudy.service.GradeStudyService;

@RestController
@RequestMapping("/gradestudy")
public class GradeStudyRest extends AbstractBaseRest<GradeStudy, String>
{
    
    @Autowired
    private GradeStudyService gradeStudyService;
    
    @Override
    protected BaseService<GradeStudy, String> getService()
    {
        return gradeStudyService;
    }    
}
