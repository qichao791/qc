package com.example.demo.service.impl;

import com.example.demo.dao.BranchDao;
import com.example.demo.domain.Branch;
import com.example.demo.service.BranchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 工种业务逻辑实现类
 *
 * Created by qichao on 06/22/2020.
 */
@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchDao branchDao;

    public Branch findOneById(String branchId) {
        return branchDao.findById(branchId);
    }


    public List<Branch> getAllByDepart(@Param("departId") String departId){
        return branchDao.getByDepart(departId);
    }

    public boolean addOneBranch(@Param("branch") Branch branch){
        return branchDao.addBranch(branch);
    }

    public boolean deleteOneById( @Param("branchId") String branchId ){
        return branchDao.deleteById(branchId);
    }

    public boolean updateOneById(@Param("branch") Branch branch){
        return branchDao.updateById(branch);
    }
}
