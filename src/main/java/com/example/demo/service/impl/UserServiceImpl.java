package com.example.demo.service.impl;

import com.example.demo.dao.BranchDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 用户业务逻辑实现类
 *
 * Created by qichao on 06/23/2020.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public User findOneById(@Param("userId")String userId){
        return userDao.findById(userId);
    }

    public List<User> findByName(@Param("userName")String userName){
        return userDao.findByName(userName);
    }

    public List<User> getAllByDepart(@Param("departId") String departId){
        return userDao.getByDepart(departId);
    }

    public List<User> getAllByBranch( @Param("branchId") String branchId){
        return userDao.getByBranch(branchId);
    }

    public boolean addOneUser(@Param("user") User user){
        return userDao.addUser(user);
    }

    public boolean deleteOneById( @Param("userId") String userId ){
        return userDao.deleteById(userId);
    }

    public boolean deleteByDepart( @Param("departId") String departId ){
        return userDao.deleteByDepart(departId);
    }

    public boolean deleteByBranch( @Param("branchId") String branchId ){
        return userDao.deleteByBranch(branchId);
    }

    public boolean updateOneById(@Param("user") User user){
        return userDao.updateById(user);
    }
}
