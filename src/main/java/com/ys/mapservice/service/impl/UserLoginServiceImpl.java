package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.entity.TUser;
import com.ys.mapservice.mapper.TUserMapper;
import com.ys.mapservice.service.UserLoginService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private TUserMapper userMapper;

    @Override
    public TUser userLogin(String name,String password) {
        TUser user = userMapper.findPasswordByName(name, password);
        String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
        if (user!=null) {
            if (md5DigestAsHex.equals(user.getUPassword())) {
                return user;
            }
        }
        return user;
    }

    @Override
    public int userRegister(TUser user) {
        return userMapper.insertUser(user);
    }

    @Override
    public TUser userRegisterDetection(TUser user) {
        return userMapper.findUserByUser(user);
    }
}
