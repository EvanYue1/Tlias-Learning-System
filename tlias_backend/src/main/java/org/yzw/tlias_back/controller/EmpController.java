package org.yzw.tlias_back.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yzw.tlias_back.pojo.Emp;
import org.yzw.tlias_back.pojo.PageResult;
import org.yzw.tlias_back.pojo.Result;
import org.yzw.tlias_back.service.EmpService;

@RestController
@RequestMapping("/emps")
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping(method = RequestMethod.GET)
    public Result getPageEmp(@RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("Controller getPageEmp called");
        log.info("-- parameter: page is {}, pageSize is {}\n", page, pageSize);
        PageResult<Emp> result = empService.getPageEmp(page, pageSize);
        return Result.success(result);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteEmp(Integer id) {
        empService.delete(id);
        return Result.success();
    }
}
