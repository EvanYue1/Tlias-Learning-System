package org.yzw.tlias_back.mapper;

import org.apache.ibatis.annotations.*;
import org.yzw.tlias_back.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept order by update_time desc")
    List<Dept> getAllDepartment();

    @Delete("delete from dept where id=#{deptId}")
    void deleteDeptById(Integer deptId);

    @Insert("insert into dept(name, update_time, create_time) values (#{name}, now(), now())")
    void addDept(Dept dept);

    @Update("update dept set name = #{name} where id = #{id}")
    void updateDept(Dept dept);

    @Select("select * from dept where id = #{deptId}")
    List<Dept> selectDept(Integer deptId);

}
