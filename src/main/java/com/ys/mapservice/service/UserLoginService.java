package com.ys.mapservice.service;

import com.ys.mapservice.domain.entity.TUser;

/**
 * @author 老铁
 */
public interface UserLoginService {
    /**
     * 用户登录业务
     * @param name 用户名
     * @param password 密码
     * @return 返回User
     */
    TUser userLogin(String name ,String password);

    /**
     * 用户注册业务
     * @param user 用户信息
     * @return 返回影响行数
     */
    int userRegister(TUser user);

    /**
     * 用户注册验证是否有重名
     * @param user 用户
     * @return user
     */
    TUser userRegisterDetection(TUser user);
}
