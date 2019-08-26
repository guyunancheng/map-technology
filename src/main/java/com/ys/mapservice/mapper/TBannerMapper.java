package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TBanner;

import java.util.List;

/**
 * @author 轮播表操作
 */
public interface TBannerMapper {
    /**
     * 查询所有
     * @return 返回所有轮播信息
     */
    List<TBanner> findAllBanner();
}