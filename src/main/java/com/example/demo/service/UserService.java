package com.example.demo.service;
import com.example.demo.domain.Branch;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * User Service Interface
 *
 * Created by qichao on 06/23/2020
 */
public interface UserService {
    User findOneById(@Param("userId")String userId);

    List<User> findByName(@Param("userName")String userName);

    List<User> getAllByDepart( @Param("departId") String departId);

    List<User> getAllByBranch( @Param("branchId") String branchId);

    boolean addOneUser(@Param("user") User user);

    boolean deleteOneById( @Param("userId") String userId );

    boolean deleteByDepart( @Param("departId") String departId );

    boolean deleteByBranch( @Param("branchId") String branchId );

    boolean updateOneById(@Param("user") User user);
}
