package com.example.demo.service;

import com.example.demo.domain.Department;

import java.util.List;

/**
 * Department Service Interface
 *
 * Created by qichao on 06/08/2020
 */
public interface DepartmentService {
    /**
     * 根据部门名称，查询部门信息
     * @param departmentName 部门名称
     */
    Department findDepartmentByName(String departmentName);
    /**
     * 获取所有部门
     *
     */
    List<Department> getAllDepartments( );
    /**
     * 新增部门
     * @param department 部门类对象
     */
    boolean addOneDepartment(Department department);

    /**
     * 删除部门
     * @param departmentId 部门ID
     */
    boolean deleteOneDepartment(int departmentId);

    /**
     * 更新部门
     * @param department 部门类对象
     */
    boolean updateOneDepartment(Department department);
}
