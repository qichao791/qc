package com.example.demo.dao;

import com.example.demo.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门DAO接口类
 * Created by qichao on 06/08/2020
 */
public interface DepartmentDao {
    /**
     * 根据部门名称，查询部门信息
     *
     * @param departmentName 部门名称
     */
    Department findByName( @Param("departmentName") String departmentName );
    /**
     * 获取所有部门
     *
     */
    List<Department> getAllDepartments( );
    /**
     * 新增一个部门
     *
     * @param department
     */
    boolean addDepartment(Department department);
    /**
     * 删除一个部门
     *
     * @param departmentId
     */
    boolean deleteById( @Param("departmentId") int departmentId );
    /**
     * 更新一个部门
     *
     * @param department
     */
    boolean updateById(Department department );
}
