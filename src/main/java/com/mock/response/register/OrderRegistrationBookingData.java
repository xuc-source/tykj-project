package com.mock.response.register;

import com.mock.model.IsvResponseData;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 挂号确认请求体
 **/
@Getter
@Setter
@ToString
public class OrderRegistrationBookingData implements IsvResponseData {

	private String doctorId;//医生唯一识别号
	private String doctorName;//医生姓名
	private String doctorTitle;//医生级别
	private String doctorNo;//医生编号
	private String departmentId;//科室ID
	private String departmentName;//科室名称
	private String departmentNo;//科室编号
	private String queueNum;//就诊号/排队号
	private String registerDate;//挂号日期
	private String orderId;// 预约号
	private String orderNo;// 预约订单号
	private String hisOrderNo;// HIS预约订单号
	private String accountBalance;// 会员账户余额
	private String amount;// 挂号金额
	private String timeRange;// 就诊时段
	private String startTime;// 起始时间
	private String endTime;// 结束时间
}
