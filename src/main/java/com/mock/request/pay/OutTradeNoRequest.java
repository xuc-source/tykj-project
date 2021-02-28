package com.mock.request.pay;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.pay.TradeNoResponseData;
import lombok.Data;

/**
 * 商家订单号获取接口请求参数
 **/
@Data
public class OutTradeNoRequest implements IsvRequest<TradeNoResponseData>, IAppIdRequest, IUserIdRequest {


    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private Integer type;//订单类型标识，现阶段主要是挂号费和充值订单; 1-挂号费订单 2-充值订单
    private String idNum;//唯一识别号，根据订单类型不同含义不同。见本节开头对照。
    private String amount;//订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    private String depName;//科室名称，挂号费订单会传入

    @Override
    public String serviceName() {
        return "isvRequest.pay.tradeNoQuery";
    }
}
