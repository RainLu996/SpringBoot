package com.lujun61.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lujun61.mybatisplus.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper注解：给 MyBatis 映射器标记接口
 *        作用：通知MyBatis当前接口是dao接口，需要给它创建接口的代理对象
 *        位置：在接口的上面
 *
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {
    Student selectStudentById(@Param("id") Integer id);
}
