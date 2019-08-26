package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TServe;
import com.ys.mapservice.domain.vo.TServeVo;
import org.apache.ibatis.annotations.Param;

public interface TServeMapper {
    /**
     * 通过serveId查询Case
      * @param serveId id
     * @return 类TSereVo
     */
    TServeVo findCaseByServeId(@Param("serveId") int serveId);
}