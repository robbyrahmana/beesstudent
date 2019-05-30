package com.elephants.beesstudent.base.rest;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.elephants.beesstudent.base.Base;
import com.elephants.beesstudent.base.model.BaseModel;
import com.elephants.beesstudent.base.service.BaseService;

public abstract class AbstractBaseRest<T extends BaseModel, ID extends Serializable>
{

    protected abstract BaseService<T, ID> getService();

    /**
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    protected T getById(@PathVariable("id") ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseRest getById(@PathVariable(\"id\") ID id) with id: {}", id);
        return this.getService().find(id);
    }

    /**
     * @return
     */
    @GetMapping
    protected List<T> getAll()
    {
        Base.LOGGER.info("Invoke AbstractBaseRest getAll()");
        return this.getService().findAll();
    }

    /**
     * @param entity
     * @return
     */
    @PostMapping
    protected T save(@RequestBody T entity)
    {
        Base.LOGGER.info("Invoke AbstractBaseRest save(@RequestBody T entity) with entity: {}", entity);
        return this.getService().save(entity);
    }

    /**
     * @param entity
     * @return
     */
    @PutMapping
    protected T update(@RequestBody T entity)
    {
        Base.LOGGER.info("Invoke AbstractBaseRest update(@RequestBody T entity) with entity: {}", entity);
        return this.getService().update(entity);
    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping(path = "/{id}")
    protected T delete(@PathVariable("id") ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseRest delete(@PathVariable(\"id\") ID id) with id: {}", id);
        return this.getService().delete(id);
    }

    /**
     * @param id
     * @return
     */
    @PatchMapping(path = "/{id}")
    protected T active(@PathVariable("id") ID id)
    {
        Base.LOGGER.info("Invoke AbstractBaseRest active(@PathVariable(\"id\") ID id) with id: {}", id);
        return this.getService().active(id);
    }
}
