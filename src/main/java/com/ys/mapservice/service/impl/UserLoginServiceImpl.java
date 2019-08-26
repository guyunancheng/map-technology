package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.entity.TUser;
import com.ys.mapservice.mapper.TUserMapper;
import com.ys.mapservice.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private TUserMapper userMapper;

    @Override
    public TUser userLogin(String name) {
        return userMapper.findPasswordByName(name);
    }

    @Override
    public int userRegister(TUser user) {
        return userMapper.insertUser(user);
    }
}
