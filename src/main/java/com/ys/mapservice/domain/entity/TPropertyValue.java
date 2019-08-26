package com.ys.mapservice.domain.entity;

import lombok.Data;

@Data
public class TPropertyValue {
    private Integer propertyValueId;

    private Integer serveId;

    private Integer propertyId;

    private String propertyValueDec;
}