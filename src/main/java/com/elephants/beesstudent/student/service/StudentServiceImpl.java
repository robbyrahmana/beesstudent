package com.elephants.beesstudent.student.service;

import org.springframework.stereotype.Service;

import com.elephants.beesstudent.base.service.AbstractBaseServiceImpl;
import com.elephants.beesstudent.student.model.Student;

@Service
public class StudentServiceImpl extends AbstractBaseServiceImpl<Student, String> implements StudentService
{

}
