package com.elephants.beesstudent.curriculum.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephants.beesstudent.base.rest.AbstractBaseRest;
import com.elephants.beesstudent.base.service.BaseService;
import com.elephants.beesstudent.curriculum.model.Curriculum;
import com.elephants.beesstudent.curriculum.service.CurriculumService;

@RestController
@RequestMapping("/curriculum")
public class CurriculumRest extends AbstractBaseRest<Curriculum, String>
{
    @Autowired
    CurriculumService curriculumService;

    @Override
    protected BaseService<Curriculum, String> getService()
    {
        return curriculumService;
    }
}
