package com.ys.mapservice.domain.vo;

import com.ys.mapservice.domain.entity.TCase;
import com.ys.mapservice.domain.entity.TServe;
import lombok.Data;

import java.util.List;

/**
 * @author 老铁
 */
@Data
public class TServeVo extends TServe {
    private List<TCase> caseList;
}
