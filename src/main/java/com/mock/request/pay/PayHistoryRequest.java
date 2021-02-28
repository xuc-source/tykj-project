package com.mock.request.pay;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.pay.PayHistoryResponseData;
import lombok.Data;

/**
 * 查询订单列表的请求
 **/
@Data
public class PayHistoryRequest implements IsvPageRequest<PayHistoryResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String cardNum;//就诊卡卡号
    private int pageIndex;//页码
    private int pageSize;//页条数

    private String userId;//用户唯一id
    private Integer type;//订单类型标识，现阶段主要是挂号费和充值订单; 1-挂号费订单 2-充值订单 9-全部（默认）
    private String status;//订单状态;0-待支付 1-已支付 9-已取消, 如果要传多个，使用逗号传多个状态


    @Override
    public String serviceName() {
        return "isvRequest.pay.payHistory";
    }
}
