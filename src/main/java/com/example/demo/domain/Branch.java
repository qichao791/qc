package com.example.demo.domain;
/**
 * Branch entity Class
 *
 * @author qichao
 * @date 06/22/2020
 */
public class Branch {
    /**
     * 工种ID
     */
    private String branchId;
    /**
     * 工种名称
     */
    private String branchName;
    /**
     * 工种描述
     */
    private String description;
    /**
     * 所属部门ID
     */
    private String departId;

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }
}
