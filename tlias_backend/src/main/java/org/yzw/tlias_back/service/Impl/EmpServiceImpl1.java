package org.yzw.tlias_back.service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzw.tlias_back.mapper.EmpMapper;
import org.yzw.tlias_back.pojo.Emp;
import org.yzw.tlias_back.pojo.PageResult;
import org.yzw.tlias_back.service.EmpService;

import java.util.List;

@Service
@Slf4j
public class EmpServiceImpl1 implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult<Emp> getPageEmp(Integer page, Integer pageSize) {
        log.info("Service getPageEmp called");
        log.info("-- parameter: page is {}, pageSize is {}\n", page, pageSize);
        PageResult<Emp> pageResult = new PageResult<>();
        Integer start = (page - 1) * pageSize;
        pageResult.setRows(empMapper.getPageEmp(start, pageSize));
        pageResult.setTotal(empMapper.count());
        return pageResult;
    }

    @Override
    public void delete(Integer id) {
        empMapper.delete(id);
    }
}
