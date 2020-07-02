package com.example.demo.domain;

/**
 * Department Class
 *
 * @author qichao
 * @date 06/08/2020
 */

public class Department {
    /**
     * 部门编号
     */
    private int departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 部门描述
     */
    private String description;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
