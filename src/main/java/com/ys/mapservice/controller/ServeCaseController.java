package com.ys.mapservice.controller;

import com.ys.mapservice.domain.vo.TServeVo;
import com.ys.mapservice.service.ServeCaseService;
import com.ys.mapservice.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 老铁
 */
@RestController
@Slf4j
public class ServeCaseController {
    @Resource
    private ServeCaseService serveCaseService;
    @RequestMapping("/caseShow")
    public Result caseShow(@Param("serveId") int serveId){
        try {
            TServeVo tServeVo = serveCaseService.serveCaseById(serveId);
            return Result.success(tServeVo);
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return Result.error();
    }
}
