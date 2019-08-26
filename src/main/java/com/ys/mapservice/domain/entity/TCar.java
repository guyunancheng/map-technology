package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class TCar {
    private Integer carId;

    private Integer uId;

    private Integer serveId;

    private Integer carNum;

    private Date crateTime;

    private Date updateTime;

    private Byte carStatus;
}