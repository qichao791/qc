package com.example.demo.dao;
import com.example.demo.domain.Branch;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 用户DAO接口
 * Created by qichao on 06/23/2020
 */
@Repository
public interface UserDao {
    /**
     * 根据用户ID，返回该用户
     *
     * @param userId
     */
    User findById(@Param("userId") String userId );
    /**
     * 根据用户姓名，返回用户
     *
     * @param userName
     */
    @Select("select * from user where user_name=#{userName}")
    List<User> findByName(@Param("userName") String userName );
    /**
     * 根据部门获取所有下属员工
     *
     */
    List<User> getByDepart( @Param("departId") String departId);
    /**
     * 根据工种获取所有下属员工
     *
     */
    List<User> getByBranch( @Param("branchId") String branchId);
    /**
     * 新增一个用户
     *
     * @param user
     */

    boolean addUser(@Param("user") User user);
    /**
     *  根据用户ID，删除一个用户
     *
     * @param userId
     */
    boolean deleteById( @Param("userId") String userId );
    /**
     * 根据工种ID，删除用户
     *
     * @param branchId
     */
    boolean deleteByBranch( @Param("branchId") String branchId );
    /**
     * 根据部门ID，删除用户
     *
     * @param departId
     */
    boolean deleteByDepart( @Param("departId") String departId );
    /**
     * 更新一个用户
     *
     * @param user
     */
    boolean updateById(@Param("user") User user);
}
