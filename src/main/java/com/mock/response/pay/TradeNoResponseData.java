package com.mock.response.pay;

import com.mock.model.IsvResponseData;
import lombok.Data;

/**
 * 获取的商家订单号
 * 需要根据预约单、充值单等类型获取外部订单号提供给支付宝。
 * 请将此订单号同具体业务做关联，并保证订单号全局唯一，后续可根据此订单号做支付记录等相关查询。
 **/
@Data
public class TradeNoResponseData implements IsvResponseData {
    private String outTradeNo;//商家订单号(区别于支付宝订单号)
    private String tradeNo;//支付宝订单号
}
