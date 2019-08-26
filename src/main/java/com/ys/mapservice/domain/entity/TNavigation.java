package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TNavigation {
    private Integer navId;

    private String navName;

    private Date crateTime;

    private Date updateTime;
}