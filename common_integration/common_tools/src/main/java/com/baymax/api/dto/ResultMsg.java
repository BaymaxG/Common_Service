package com.baymax.api.dto;

import lombok.Data;

/**
 * @author guningbo
 * @since 2020/3/29
 */
@Data
public class ResultMsg<T> {
    private static final int SUCCESS_STATUS = 1;

    private static final String SUCCESS_MSG = "success";

    private static final int FAILED_STATUS = 0;

    private static final String FAILED_MSG = "failed";

    private String errorCode;

    private int status;

    private String msg;

    private T Data;

    public ResultMsg() {
    }

    public ResultMsg(T data) {
        Data = data;
    }

    public static ResultMsg buildSuccess(Object data) {
        ResultMsg resultMsg = new ResultMsg(data);
        resultMsg.setStatus(SUCCESS_STATUS);
        resultMsg.setMsg(SUCCESS_MSG);
        return resultMsg;
    }

    public static ResultMsg buildSuccess() {
        return buildSuccess(null);
    }

    public static ResultMsg buildFailed(Object data) {
        ResultMsg resultMsg = new ResultMsg(data);
        resultMsg.setErrorCode("E999999");
        resultMsg.setStatus(FAILED_STATUS);
        resultMsg.setMsg(FAILED_MSG);
        return resultMsg;
    }

    public static ResultMsg buildFailed() {
        return buildFailed(null);
    }

}
