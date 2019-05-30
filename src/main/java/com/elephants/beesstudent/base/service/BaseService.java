package com.elephants.beesstudent.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elephants.beesstudent.base.model.BaseModel;

public interface BaseService<T extends BaseModel, ID extends Serializable>
{
    Page<T> findAll(Pageable pageable);
    
    T find(ID id);
    
    List<T> findAll();
    
    T save(T entity);

    T update(T entity);
    
    /**
     * To delete, use soft delete. change isDeleted flag to TRUE
     * @param id
     */
    T delete(ID id);
    
    /**
     * To active deleted record. change isDeleted flag to FALSE
     * @param id
     */
    T active(ID id);
    
}
