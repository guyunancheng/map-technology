package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author 用户增删改插
 */
public interface TUserMapper {
    /**
     * 根据用户名查密码
     * @param name 用户名
     * @return 用户密码
     */
    TUser findPasswordByName(String name);

    /**
     * 添加用户
     * @param user 用户
     * @return 返回影响行数
     */
    int insertUser(@Param("user") TUser user);

}