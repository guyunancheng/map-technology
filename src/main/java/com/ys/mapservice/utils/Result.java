package com.ys.mapservice.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 老铁
 */
@Data
public class Result<T> implements Serializable {
    private String msg;
    private int state;
    private T data;

    public static Result success(Object obj){
        Result result = new Result();
        result.setState(Constants.SUCCESS_STATE_200);
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setState(Constants.ERROR_STATE_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }
}
