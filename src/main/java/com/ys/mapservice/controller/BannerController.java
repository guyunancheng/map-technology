package com.ys.mapservice.controller;

import com.ys.mapservice.domain.entity.TBanner;
import com.ys.mapservice.service.BannerService;
import com.ys.mapservice.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 老铁
 */
@RestController
@Slf4j
public class BannerController {
    @Resource
    private BannerService bannerService;
    @RequestMapping("/banner")
    public Result bannerShow(){
        try{
            List<TBanner> tBanners = bannerService.bannerShow();
            return Result.success(tBanners);
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return Result.error();
    }
}
