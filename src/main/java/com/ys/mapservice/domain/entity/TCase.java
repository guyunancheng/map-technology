package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TCase {
    private Integer caseId;

    private String caseTitle;

    private Integer serveId;

    private String caseDec;

    private Date crateTime;

    private Byte crateStatus;
}