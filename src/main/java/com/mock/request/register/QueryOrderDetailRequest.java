package com.mock.request.register;

import com.mock.model.IsvRequest;
import com.mock.response.register.QueryOrderDetailResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 预约单详情请求体
 **/
@Getter
@Setter
@ToString
public class QueryOrderDetailRequest implements IsvRequest<QueryOrderDetailResponseData> {

    private String appId;//医院小程序的AppId
    private String orderId;//用户唯一识别号
    private String userId;

    @Override
    public String serviceName() {
        return "isvRequest.order.orderDetail";
    }
}
