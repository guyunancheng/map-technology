package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TUser {
    private Integer uId;

    private String uName;

    private String uPassword;

    private Date crateTime;

    private Date updateTime;
}