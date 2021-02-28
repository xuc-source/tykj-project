package com.mock.response.pay;

import com.mock.model.IsvResponseData;
import lombok.Data;

@Data
public class TradeNoForOrderResponseData implements IsvResponseData {
    private boolean needPay;//是否需要另行支付标识，如全部支付金额已通过其他途径结算，则此字段返回false，此时商家订单号及支付宝订单号均为空，小程序端不再发起支付，直接进入完成页面
    private String outTradeNo;//商家订单号(区别于支付宝订单号)
    private String tradeNo;//支付宝订单号
}
