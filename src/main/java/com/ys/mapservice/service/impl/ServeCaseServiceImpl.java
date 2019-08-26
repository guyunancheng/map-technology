package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.vo.TServeVo;
import com.ys.mapservice.mapper.TServeMapper;
import com.ys.mapservice.service.ServeCaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@Service
public class ServeCaseServiceImpl implements ServeCaseService {
    @Resource
    private TServeMapper serveMapper;

    @Override
    public TServeVo serveCaseById(int serveId) {
        return serveMapper.findCaseByServeId(serveId);
    }
}
