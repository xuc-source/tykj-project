package com.mock.request.register;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.register.OrderConfirmResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 挂号确认请求体
 **/
@Getter
@Setter
@ToString
public class OrderConfirmRequest implements IsvRequest<OrderConfirmResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一识别号
    private String doctorId;//医生唯一识别号
    private String orderSourceId;//号源id
    private String cardNum;//就诊卡卡号

    @Override
    public String serviceName() {
        return "isvRequest.order.orderConfirm";
    }
}
