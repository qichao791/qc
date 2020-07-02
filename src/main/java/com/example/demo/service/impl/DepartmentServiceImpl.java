package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.domain.Department;
import com.example.demo.service.DepartmentService;
import com.fasterxml.uuid.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 部门业务逻辑实现类
 *
 * Created by qichao on 06/08/2020.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentDao departmentDao;

    public Department findDepartmentByName(String departmentName) {
        return departmentDao.findByName(departmentName);
    }
    public List<Department> getAllDepartments( ){ return departmentDao.getAllDepartments();}

    public boolean addOneDepartment(Department department) {

        return departmentDao.addDepartment(department);
    }

    public boolean deleteOneDepartment( int departmentId ) {
        return departmentDao.deleteById( departmentId);
    }

    public boolean updateOneDepartment(Department department){ return departmentDao.updateById( department );}


}
