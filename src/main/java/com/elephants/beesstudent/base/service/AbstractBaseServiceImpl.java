package com.elephants.beesstudent.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.elephants.beesstudent.base.Base;
import com.elephants.beesstudent.base.model.BaseModel;
import com.elephants.beesstudent.base.model.CommonModel;
import com.elephants.beesstudent.base.repository.BaseRepository;

public abstract class AbstractBaseServiceImpl<T extends BaseModel, ID extends Serializable>
    implements BaseService<T, ID>
{

    @Autowired
    private BaseRepository<T, ID> baseRepository;

    
    @Override
    public Page<T> findAll(Pageable pageable)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl findAll(Pageable pageable) with pageable: {}", pageable);
        return baseRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public T find(ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl find(ID id) with id: {}", id);
        return baseRepository.findById(id).get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll()
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl findAll()");
        return baseRepository.findAll();
    }

    @Override
    @Transactional
    public T save(T entity)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl save(T entity) with entity: {}", entity);
        return baseRepository.saveAndFlush(entity);
    }

    @Override
    @Transactional
    public T update(T entity)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl update(T entity) with entity: {}", entity);
        return baseRepository.saveAndFlush(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public T delete(ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl delete(ID id) with id: {}", id);
        CommonModel existingData = (CommonModel) find(id);
        existingData.setDeleted(Boolean.TRUE);

        return baseRepository.saveAndFlush((T) existingData);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public T active(ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseServiceImpl active(ID id) with id: {}", id);
        CommonModel existingData = (CommonModel) find(id);
        existingData.setDeleted(Boolean.FALSE);

        return baseRepository.saveAndFlush((T) existingData);
    }
}
