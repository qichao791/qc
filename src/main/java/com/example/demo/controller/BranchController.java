package com.example.demo.controller;
import com.example.demo.domain.Branch;
import com.example.demo.domain.Department;
import com.example.demo.service.BranchService;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by qichao on 06/22/2020.
 */
@RestController
public class BranchController {
    @Autowired
    private BranchService branchService;

    //opopop

    @GetMapping("/api/branch/getOneBranch")
    public Branch findOneBranch(@RequestParam(value = "branchId", required = true) String branchId) {
        return branchService.findOneById(branchId);
    }
    @GetMapping("/api/branch/getAllBranch")
    public List<Branch> getAllBranchs(@RequestParam(value = "departId", required = true) String departId) {
        return branchService.getAllByDepart(departId);
    }
    @PostMapping("/api/branch/addBranch")
    public boolean addOneBranch(@RequestBody Branch branch) {
        return branchService.addOneBranch(branch);
    }
    @DeleteMapping("/api/branch/deleteBranch")
    public boolean deleteOneBranch(@RequestParam(value = "branchId", required = true) String branchId) {
        return branchService.deleteOneById(branchId);
    }
    @PutMapping("/api/branch/updateBranch")
    public boolean updateOneBranch(@RequestBody Branch branch) {
        return branchService.updateOneById(branch);

    }
}
