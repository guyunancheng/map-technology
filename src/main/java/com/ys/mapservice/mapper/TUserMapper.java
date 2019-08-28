package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TUser;
import com.ys.mapservice.domain.vo.TUserVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author 用户增删改插
 */
public interface TUserMapper {
    /**
     * 根据用户名查密码
     * @param name 用户名
     * @param password 密码
     * @return 用户密码
     */
    TUser findPasswordByName(String name,String password);

    /**
     * 添加用户
     * @param user 用户
     * @return 返回影响行数
     */
    int insertUser(@Param("user") TUser user);

    /**
     * 注册验证查询
     * @param user 用户
     * @return  user
     */
    TUser findUserByUser(@Param("user") TUser user);

    /**
     * 通过用户Id查询用户产品期限
     * @param userId uid
     * @return userVo
     */
    TUserVo findTimeByUserId(@Param("userId") int userId);

}