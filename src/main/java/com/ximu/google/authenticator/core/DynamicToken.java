package com.ximu.google.authenticator.core;

/**
 * Created by leon on 2018/8/2.
 */
public class DynamicToken {
    /**
     * 秘钥
     */
    private String secKey;
    /**
     * 时间片长度
     */
    private int interval;

    public DynamicToken(String secKey, int interval) {
        this.secKey = secKey;
        this.interval = interval;
    }
}
