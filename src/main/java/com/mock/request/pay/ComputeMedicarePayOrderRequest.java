package com.mock.request.pay;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.pay.ComputeMedicarePayOrderResponseData;
import lombok.Data;

@Data
public class ComputeMedicarePayOrderRequest implements IsvRequest<ComputeMedicarePayOrderResponseData>, IAppIdRequest {
    private String appId;//医院小程序的AppId
    private String outTradeNo;//订单号
    private String authCode;//授权码

    @Override
    public String serviceName() {
        return "miniProRequest.pay.computeMedicarePayOrder";
    }
}
