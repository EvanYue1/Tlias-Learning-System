package org.yzw.tlias_back.service;

import org.yzw.tlias_back.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getAllDepartment();
    void deleteDeptById(Integer deptId);
    void addDept(Dept dept);
    void updateDept(Dept dept);
    List<Dept> selectDept(Integer deptId);

}
