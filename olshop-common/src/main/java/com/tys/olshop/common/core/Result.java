package com.tys.olshop.common.core;

import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * @author TYS
 * @date 2020/4/18 13:53
 */
@Getter
@Accessors(chain = true)
public class Result {
    private int code;
    private String message;
    private Object data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}