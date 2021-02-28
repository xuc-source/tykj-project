package com.mock.model;

/**
 * isv
 * 请求参数
 * 如果查询是分页查询,则请求参数使用这个传递
 * POJO
 **/
public interface IsvPageRequest<T extends IsvResponseData> extends BaseIsvRequest {

    /**
     * 分页请求要有分页参数
     * 页码,默认从1开始
     *
     **/
    int getPageIndex();//页码

    int getPageSize();//页大小
}
