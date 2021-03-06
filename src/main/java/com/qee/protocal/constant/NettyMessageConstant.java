package com.qee.protocal.constant;

/**
 * Created by zhuqi on 2017/9/8.
 */
public class NettyMessageConstant {

    /**
     * 业务请求消息
     */
    public static final byte CUSTOMER_BUSINESS_TYPE = 1;

    /**
     * 业务响应消息
     */
    public static final byte SERVER_BUSINESS_TYPE = 2;

    /**
     * 3:握手请求消息
     */
    public static final byte CUSTOMER_AUTH_CERTI_TYPE = 3;

    /**
     * 4：握手应答消息
     */
    public static final byte SERVER_AUTH_CERTI_TYPE = 4;

    /**
     * 心跳请求消息
     */
    public static final byte HEART_BEAT_CHECK_PING_TYPE = 5;


    /**
     * 6：心跳应答消息
     */
    public static final byte HEART_BEAT_CHECK_PONG_TYPE = 6;

}
