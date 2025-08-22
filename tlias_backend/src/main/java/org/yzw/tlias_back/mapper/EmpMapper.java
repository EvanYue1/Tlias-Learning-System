package org.yzw.tlias_back.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.yzw.tlias_back.pojo.Emp;
import org.yzw.tlias_back.pojo.PageResult;

import java.util.List;

@Mapper
public interface EmpMapper {

//  search employee and page it
    @Select("select e.*, d.name deptName from emp e left outer join dept d on e.dept_id = d.id limit #{start}, #{pageSize}")
    List<Emp> getPageEmp(Integer start, Integer pageSize);

//  search all employee data
    @Select("select count(*) from emp e left outer join dept d on e.dept_id = d.id ")
    Long count();

//   search based on condition
    List<Emp> getEmp();


    @Delete("delete from emp where id = #{id}")
    void delete(Integer id);

}
