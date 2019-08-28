package com.ys.mapservice.domain.vo;

import com.ys.mapservice.domain.entity.TTime;
import com.ys.mapservice.domain.entity.TUser;
import lombok.Data;

import java.util.List;

/**
 * @author 老铁
 */
@Data
public class TUserVo extends TUser {
    List<TTime> tTimelines;
}
