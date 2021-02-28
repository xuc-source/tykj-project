package com.mock.request.pay;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.pay.PayDetailResponseData;
import lombok.Data;

/**
 * 订单详情查询的请求参数
 **/
@Data
public class PayDetailRequest implements IsvRequest<PayDetailResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private Integer type;//订单类型标识，现阶段主要是挂号费和充值订单;1-挂号费订单 2-充值订单
    private String outTradeNo;//订单号

    @Override
    public String serviceName() {
        return "miniProRequest.pay.payDetail";
    }
}
