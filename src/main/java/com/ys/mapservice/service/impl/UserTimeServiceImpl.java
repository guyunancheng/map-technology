package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.vo.TUserVo;
import com.ys.mapservice.mapper.TUserMapper;
import com.ys.mapservice.service.UserTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@Service
public class UserTimeServiceImpl implements UserTimeService {
    @Resource
    private TUserMapper userMapper;

    @Override
    public TUserVo findTimeBar(int userId) {
        return userMapper.findTimeByUserId(userId);
    }
}
