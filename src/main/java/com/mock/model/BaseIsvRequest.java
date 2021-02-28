package com.mock.model;

public interface BaseIsvRequest {
    /**
     * @return 服务名
     **/
    String serviceName();

    /**
     * 有AppId才能找到对应的IsvClient
     *
     **/
    String getAppId();

    /**
     * 设置医院的AppId
     *
     * @param appId 浩鲸系统中的医院id
     **/
    void setAppId(String appId);
}
