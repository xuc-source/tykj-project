package com.mock.request.pay;


import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.pay.ComputeSelfPaidOrderResponseData;
import lombok.Data;

@Data
public class ComputeSelfPaidOrderRequest implements IsvRequest<ComputeSelfPaidOrderResponseData>, IAppIdRequest {
    private String appId;//医院小程序的AppId
    private String outTradeNo;//订单号

    @Override
    public String serviceName() {
        return "miniProRequest.pay.computeSelfPaidOrder";
    }
}
