package org.yzw.tlias_back.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzw.tlias_back.mapper.DeptMapper;
import org.yzw.tlias_back.pojo.Dept;
import org.yzw.tlias_back.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl1 implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getAllDepartment() {
        return deptMapper.getAllDepartment();
    }

    @Override
    public void deleteDeptById(Integer deptId) {
        deptMapper.deleteDeptById(deptId);
    }

    @Override
    public void addDept(Dept dept) {
        deptMapper.addDept(dept);
    }

    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }

    @Override
    public List<Dept> selectDept(Integer deptId) {
        return deptMapper.selectDept(deptId);
    }
}
