package com.demo.common.dto;

import com.demo.common.enums.ResponseResultEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

/**
 * 通用返回结果
 *
 * @author jiangtao
 * @date 2019/8/1 下午7:34.
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -7490447396797724706L;

    /**
     * 结果状态
     */
    private int result;
    /**
     * 结果数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String message = "";

    @Deprecated
    public void setResult(int result) {
        this.result = result;
    }

    public void setResult(ResponseResultEnum result) {
        this.result = Optional.ofNullable(result).orElse(ResponseResultEnum.SUCCESS).value();
    }

    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> ok(T data) {
        Response resp = new Response();
        resp.setResult(ResponseResultEnum.SUCCESS);
        resp.setData(data);
        return resp;
    }

    public static <T> Response<T> fail(String message) {
        Response resp = new Response();
        resp.setResult(ResponseResultEnum.FAIL);
        resp.setMessage(message);
        return resp;
    }

    public static <T> Response<T> fail(ResponseResultEnum result, String message) {
        Response resp = new Response();
        resp.setResult(result);
        resp.setMessage(message);
        return resp;
    }

    public boolean success() {
        if (result == ResponseResultEnum.SUCCESS.value()) {
            return true;
        }
        return false;
    }
}
