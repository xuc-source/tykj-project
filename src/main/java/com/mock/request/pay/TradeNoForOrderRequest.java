package com.mock.request.pay;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.pay.TradeNoForOrderResponseData;
import lombok.Data;

/**
 * 商家订单号获取接口请求参数
 **/
@Data
public class TradeNoForOrderRequest implements IsvRequest<TradeNoForOrderResponseData>, IAppIdRequest {
    private String appId;//医院小程序的AppId
    private boolean useBalance;//标识用户是否使用就诊卡余额
    private boolean useMedicare;//标识用户是否使用医保
    private String outTradeNo;//商家订单号
//    private String amount;//用户需要支付的金额,payWithBalanceAmount或者payWithoutBalanceAmount

    @Override
    public String serviceName() {
        return "isvRequest.pay.tradeNoForOrder";
    }
}
