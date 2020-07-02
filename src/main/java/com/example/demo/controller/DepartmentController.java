package com.example.demo.controller;

import com.example.demo.domain.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by qichao on 06/08/2020.
 */
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/api/getOneDepartment")
    //public Department findOneDepartment(@RequestParam(value = "departmentName", required = true) String departmentName) {
    public Department findOneDepartment(@RequestParam(value = "departmentName", required = true) String departmentName) {
        return departmentService.findDepartmentByName(departmentName);
    }
    @GetMapping("/api/showDepartments")
    public List<Department> showAllDepartments() {
        return departmentService.getAllDepartments();
    }
    @PostMapping("/api/addDepartment")
    //public boolean addOneDepartment(@RequestBody String departmentName, @RequestBody String description) {
    //public boolean addOneDepartment(@RequestBody Map<String,String> info) {
    public boolean addOneDepartment(@RequestBody Department department) {
        return departmentService.addOneDepartment(department);
        //return departmentService.addOneDepartment(info.get("departmentName"),info.get("description"));
    }
    @DeleteMapping("/api/deleteDepartment")
    public boolean deleteOneDepartment(@RequestParam(value = "departmentId", required = true) int departmentId) {
        return departmentService.deleteOneDepartment(departmentId);
    }
    @PutMapping("/api/updateDepartment")
    public boolean updateOneDepartment(@RequestBody Department department) {
        return departmentService.updateOneDepartment(department);

    }
}