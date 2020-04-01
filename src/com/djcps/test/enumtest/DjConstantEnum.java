package com.djcps.test.enumtest;

/**
 * com.djcps.djcssweb.constant
 *
 * @author: Administrator
 * @date: 2020/2/14 11:26
 * @project： djcss_service
 * @description： 常量参数
 */
public enum DjConstantEnum {
    /**
     * 判责记录处理状态  1-判责成立  2-判责撤销
     */
    SUCCESS(1, "success"),
    DATA(2, "data"),
    NUMONE(3, "1"),
    NUMTWO(4, "2"),
    ;

    private Integer code;
    private String name;

    DjConstantEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

