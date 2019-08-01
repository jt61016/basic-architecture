package com.demo.common.enums;

/**
 * 结果状态枚举
 *
 * @author jiangtao
 * @date 2019/8/1 下午7:38.
 */
public enum ResponseResultEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    /**
     * 通用失败
     */
    FAIL(1, "失败"),
    /**
     * 严重致命错误
     */
    FATAL(2, "致命错误");

    private int code;
    private String desc;

    ResponseResultEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int value() {
        return code;
    }
}
