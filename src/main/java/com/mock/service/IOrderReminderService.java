package com.mock.service;

import com.mock.response.OrderReminderResponse;

/**
 * 提醒信息相关service
 **/
public interface IOrderReminderService {

    /**
     * 查询小程序用户首页应该要展示的提醒信息
     *
     * @return 提醒信息
     **/
    OrderReminderResponse userIndexReminderInfo(String appId, String userId);
}
