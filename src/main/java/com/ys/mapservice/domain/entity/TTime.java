package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TTime {
    private Integer timeId;

    private Integer timeBar;

    private Integer uId;

    private Integer serveId;

    private Date createTime;

    /**
    * 状态值,0表示未过期,1表示过期
    */
    private Byte isState;
}