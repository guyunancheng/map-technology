package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TTimeline {
    private Integer timeId;

    private Date timeStart;

    private Integer serveId;

    private Integer uId;
}