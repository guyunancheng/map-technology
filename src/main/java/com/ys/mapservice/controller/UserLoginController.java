package com.ys.mapservice.controller;

import com.ys.mapservice.domain.entity.TUser;
import com.ys.mapservice.service.UserLoginService;
import com.ys.mapservice.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@RestController
@Slf4j
public class UserLoginController {
    @Resource
    private UserLoginService userLoginService;


    /**
     * 登录
     * @param name
     * @return
     */
    @RequestMapping("/login")
    public Result userLogin(@Param("name") String name){
        try {
            TUser tUser = userLoginService.userLogin(name);

            return Result.success(tUser);
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return Result.error();
    }
    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public Result userRegister(TUser user){
        try {
            int i = userLoginService.userRegister(user);
            return Result.success(i);
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return Result.error();
    }
}
