package com.elephants.beesstudent.study.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.study.model.Study;
import com.elephants.beesstudent.study.service.StudyService;

@RestController
@RequestMapping("/study")
public class StudyRest extends AbstractBaseRest<Study, String>
{
    
    @Autowired
    private StudyService studyService;
    
    @Override
    protected BaseService<Study, String> getService()
    {
        return studyService;
    }

}
