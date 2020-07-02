package com.example.demo.service;

import com.example.demo.domain.Branch;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * Branch Service Interface
 *
 * Created by qichao on 06/22/2020
 */
public interface BranchService {
    /**
     * 根据工种ID，查询工种信息
     * @param branchId 工种ID
     */
    Branch findOneById(String branchId);

    /**
     * 根据部门ID获取所有下属工种
     *
     */
    List<Branch> getAllByDepart( @Param("departId") String departId);
    /**
     * 根据部门ID新增一个工种
     *
     * @param branch
     */
    boolean addOneBranch(@Param("branch") Branch branch);
    /**
     * 删除一个工种
     *
     * @param branchId
     */
    boolean deleteOneById( @Param("branchId") String branchId );
    /**
     * 更新一个工种
     *
     * @param branch
     */
    boolean updateOneById(@Param("branch") Branch branch);
}
