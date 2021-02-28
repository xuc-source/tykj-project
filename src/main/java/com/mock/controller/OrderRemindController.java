package com.mock.controller;

import com.alibaba.fastjson.JSON;
import com.mock.model.ResponseVO;
import com.mock.request.OrderReminderQueryRequest;
import com.mock.response.OrderReminderResponse;
import com.mock.service.IOrderReminderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 */
@RestController
@Slf4j
public class OrderRemindController {

    @Autowired
    private IOrderReminderService orderReminderService;

    /**
     * 首页消息提醒
     *
     * @param request
     * @return
     */
    @PostMapping("miniProRequest.order.remind")
    public ResponseVO<OrderReminderResponse> userIndexReminderInfo(OrderReminderQueryRequest request) {
        log.info("request:{}", JSON.toJSONString(request));
        return ResponseVO.success(orderReminderService.userIndexReminderInfo(request.getAppId(), request.getUserId()));
    }
}
