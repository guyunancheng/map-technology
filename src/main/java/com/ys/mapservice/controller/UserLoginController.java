package com.ys.mapservice.controller;

import com.ys.mapservice.domain.entity.TUser;
import com.ys.mapservice.service.UserLoginService;
import com.ys.mapservice.utils.Result;
import lombok.extern.slf4j.Slf4j;

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
     * @param uName 用户
     * @param uPassword 密码
     * @return 返回user
     */
    @RequestMapping("/login")
    public Result userLogin(String uName,String uPassword){
        TUser tUser = userLoginService.userLogin(uName,uPassword);
        if(tUser!=null){
            try {
                return Result.success(tUser);
            }catch (Exception e){
                log.debug(e.getMessage());
            }
        }
        return Result.error();
    }
    /**
     * 注册
     * @param user 用户
     * @return 返回结果集
     */
    @RequestMapping("/register")
    public Result userRegister(TUser user){
        if (userLoginService.userRegisterDetection(user)!=null){

            return Result.error();
        }else {
            try {
                int i = userLoginService.userRegister(user);
                return Result.success(i);
            }catch (Exception e){
                log.debug(e.getMessage());
            }
            return Result.error();
        }
    }
}
