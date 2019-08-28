package com.ys.mapservice.controller;

import com.ys.mapservice.domain.vo.TUserVo;
import com.ys.mapservice.service.UserTimeService;
import com.ys.mapservice.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@RestController
public class UserTimeBarController {
    @Resource
    private UserTimeService userTimeService;

    @RequestMapping("/userTime")
    public Result userTimeBar(int userId){
        try {
            TUserVo timeBar = userTimeService.findTimeBar(userId);
            return Result.success(timeBar);
        }catch (Exception e){
            return Result.error();
        }
    }
}
