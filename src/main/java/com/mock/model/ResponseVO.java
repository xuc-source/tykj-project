package com.mock.model;

import lombok.Data;

@Data
public class ResponseVO<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResponseVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    final public static <T> ResponseVO<T> success(T data) {
        return new ResponseVO<>(200, "成功", data);
    }

    final public static <T> ResponseVO<T> fail(int code, String msg) {
        return new ResponseVO<>(code, msg, null);
    }
}
