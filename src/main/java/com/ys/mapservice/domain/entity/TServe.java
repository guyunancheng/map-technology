package com.ys.mapservice.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class TServe {
    private Integer serveId;

    private String serveName;

    private BigDecimal servePrice;

    private String serveTitle;

    private Date crateTime;

    private Date updateTime;

    private Byte serveStatus;
}