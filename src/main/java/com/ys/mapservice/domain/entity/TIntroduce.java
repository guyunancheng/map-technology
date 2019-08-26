package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TIntroduce {
    private Integer introduceId;

    private String introduceTitle;

    private String introduceDec;

    private Date crateTime;

    private Date updateTime;
}