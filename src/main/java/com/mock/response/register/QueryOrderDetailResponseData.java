package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryOrderDetailResponseData implements IsvResponseData {
    private String orderId;//预约订单号
    private String orderNo;//预约编码
    private String timeRange;//就诊时间段
    private String qrCode;//预约详情展示的二位码值
    private String startTime;//号源开始时间段（yyyy-MM-dd HH:mm:ss）
    private String endTime;//号源截止时间段（yyyy-MM-dd HH:mm:ss）
    private String doctorName;//医生姓名
    private String depName;//科室名称
    private String userName;//就诊卡姓名
    private String cardNum;//就诊卡卡号
    private String queueNum;//就诊号/排队号
    private Integer status;//预约单状态
    private String amount;//支付金额
    private String payType;//支付方式
    private String createTime;//预约单创建时间
    private String cancelTime;//预约单取消时间
}
