package com.mock.request.register;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.register.CancelOrderResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 取消预约
 **/
@Getter
@Setter
@ToString
public class CancelOrderRequest implements IsvRequest<CancelOrderResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String orderId;//预约订单号
    private String reason;//取消原因

    @Override
    public String serviceName() {
        return "isvRequest.order.cancelOrder";
    }
}
