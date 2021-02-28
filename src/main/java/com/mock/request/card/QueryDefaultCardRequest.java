package com.mock.request.card;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.QueryDefaultCardResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 默认就诊卡查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryDefaultCardRequest implements IsvRequest<QueryDefaultCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.defaultCard";
    }
}
