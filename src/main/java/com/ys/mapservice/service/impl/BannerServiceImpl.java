package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.entity.TBanner;
import com.ys.mapservice.mapper.TBannerMapper;
import com.ys.mapservice.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 老铁
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private TBannerMapper bannerMapper;
    @Override
    public List<TBanner> bannerShow() {
        return bannerMapper.findAllBanner();
    }
}
