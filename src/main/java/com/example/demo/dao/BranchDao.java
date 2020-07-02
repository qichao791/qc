package com.example.demo.dao;

import com.example.demo.domain.Branch;
import com.example.demo.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 工种DAO接口
 * Created by qichao on 06/22/2020
 */
public interface BranchDao {
    /**
     * 根据工种名称，返回该工种
     *
     * @param branchId
     */
    Branch findById(@Param("branchId") String branchId );
    /**
     * 根据部门ID获取所有下属工种
     *
     */
    List<Branch> getByDepart( @Param("departId") String departId);
    /**
     * 根据部门ID新增一个工种
     *
     * @param branch
     */
    boolean addBranch(@Param("branch") Branch branch);
    /**
     * 删除一个工种
     *
     * @param branchId
     */
    boolean deleteById( @Param("branchId") String branchId );
    /**
     * 更新一个工种
     *
     * @param branch
     */
    boolean updateById(@Param("branch") Branch branch);
}
