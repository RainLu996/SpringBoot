package com.lujun61.dao;

import com.lujun61.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper注解：给 MyBatis 映射器标记接口
 *        作用：通知MyBatis当前接口是dao接口，需要给它创建接口的代理对象
 *        位置：在接口的上面
 */
@Mapper
/**  使用MyBatisPlus 增强 MyBatis 功能：
        MyBatisPlus 只做增强不做修改，所以仍然可以 自定义dao方法，并在mapper文件中实现
 */
public interface StudentDao {
//public interface StudentDao {

    Student selectStudentById(@Param("id") Integer id);
}
