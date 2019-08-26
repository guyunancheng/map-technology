package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TNews {
    private Integer newsId;

    private String newsTitle;

    private String newsDec;

    private Date crateTime;

    private Date updateTime;
}