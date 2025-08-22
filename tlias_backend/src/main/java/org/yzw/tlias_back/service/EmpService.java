package org.yzw.tlias_back.service;

import org.yzw.tlias_back.pojo.Emp;
import org.yzw.tlias_back.pojo.PageResult;

import java.util.List;

public interface EmpService {
    /**
     * page search
     * @param page the page index
     * @param pageSize the size of page
     * */
    PageResult<Emp> getPageEmp(Integer page, Integer pageSize);
    void delete(Integer id);
}