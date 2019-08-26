package com.ys.mapservice.service;

import com.ys.mapservice.domain.vo.TServeVo;

/**
 * @author 老铁
 */
public interface ServeCaseService {
    /**
     * 通过服务Id查询案例业务
     * @param serveId 服务Id
     * @return 返回TServeVo
     */
    TServeVo serveCaseById(int serveId);
}
