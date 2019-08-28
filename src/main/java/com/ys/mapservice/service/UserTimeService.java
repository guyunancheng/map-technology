package com.ys.mapservice.service;

import com.ys.mapservice.domain.vo.TUserVo;
import org.springframework.stereotype.Service;

/**
 * @author 老铁
 */
public interface UserTimeService {
    /**
     * 用户产品期限
     * @param userId 用户Id
     * @return 返回userVo
     */
    TUserVo findTimeBar(int userId);
}
