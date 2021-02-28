package com.mock.response;

import lombok.Data;

/**
 * 单条提醒信息
 **/
@Data
public class OrderReminderResponse {
    private String orderId;//预约订单号
    private String userName;//就诊卡姓名
    private String timeRange;//预约时间段  //2020-01-02 9:00:00至9:30:00
    private String doctorName;//医生姓名
    private String depName;//科室名称
    private String queueNum;//就诊号/排队号，允许为空或不返回此字段
}
