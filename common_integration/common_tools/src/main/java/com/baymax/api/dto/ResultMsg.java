package com.baymax.api.dto;

import lombok.Data;

/**
 * @author guningbo
 * @since 2020/3/29
 */
@Data
public class ResultMsg<T> {
    private String errorCode;

    private int status;

    private String errorMsg;

    private T Data;

    public ResultMsg() {
    }

    public ResultMsg(T data) {
        Data = data;
    }

    public static ResultMsg buildSuccess(Object data) {
        ResultMsg resultMsg = new ResultMsg(data);
        resultMsg.setStatus(1);
        return resultMsg;
    }

    public static ResultMsg buildSuccess() {
        return buildSuccess(null);
    }

    public static ResultMsg buildFailed(Object data) {
        ResultMsg resultMsg = new ResultMsg(data);
        resultMsg.setErrorCode("E999999");
        resultMsg.setStatus(0);
        return resultMsg;
    }

    public static ResultMsg buildFailed() {
        return buildFailed(null);
    }

}
