package com.mock.request.pay;


import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.pay.TradeResultResponseData;
import lombok.Data;

/**
 * 用于通知isv方用户支付结果。
 * isv方也可根据订单号单独调用支付宝接口查询。
 * 接口文档地址：https://opendocs.alipay.com/apis/api_1/alipay.trade.query/
 **/
@Data
public class TradeResultRequest implements IsvRequest<TradeResultResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String outTradeNo;//商家订单号(区别于支付宝订单号)
    private String tradeNo;//支付宝订单号
    private String status;//订单支付状态; 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）

    @Override
    public String serviceName() {
        return "isvRequest.pay.tradeResult";
    }
}
