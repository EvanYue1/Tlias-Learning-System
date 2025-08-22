package org.yzw.tlias_back.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yzw.tlias_back.pojo.Dept;
import org.yzw.tlias_back.pojo.Result;
import org.yzw.tlias_back.service.DeptService;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    public Result getListOfAllDept() {
        log.info("getListOfAllDept called");
        log.info("-- method: getListOfAllDept, parameter nothing");
        List<Dept> listOfAllDept = deptService.getAllDepartment();
        return Result.success(listOfAllDept);
    }

    @RequestMapping(value = "/depts", method = RequestMethod.DELETE)
    public Result deleteDept(Integer id) {
        log.info("deleteDept called");
        log.info("-- method: deleteDept, parameter id:{}", id);
        deptService.deleteDeptById(id);
        return Result.success();
    }

    @RequestMapping(value = "/depts", method = RequestMethod.POST)
    public Result addDept(@RequestBody Dept dept) {
        log.info("addDept called");
        log.info("-- method: addDept, parameter name:{}", dept.getName());
        deptService.addDept(dept);
        return Result.success();
    }

    @RequestMapping(value = "/depts", method = RequestMethod.PUT)
    public Result updateDept(@RequestBody Dept dept) {
        log.info("updateDept called");
        log.info("-- method: updateDept, parameter id:{}, name{}", dept.getId(), dept.getName());
        deptService.updateDept(dept);
        return Result.success();
    }

    @RequestMapping(value = "/depts/{id}", method = RequestMethod.GET)
    public Result selectDept(@PathVariable Integer id) {
        log.info("selectDept called");
        log.info("-- method: selectDept, parameter id:{}", id);
        List<Dept> selectedDept = deptService.selectDept(id);
        return Result.success(selectedDept);
    }


}