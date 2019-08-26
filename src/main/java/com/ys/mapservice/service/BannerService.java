package com.ys.mapservice.service;

import com.ys.mapservice.domain.entity.TBanner;

import java.util.List;

/**
 * @author 老铁
 */
public interface BannerService {
    /**
     * 轮播业务
     * @return 轮播信息
     */
    List<TBanner> bannerShow();
}
