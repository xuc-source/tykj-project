package com.mock.request.card;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.QuerySingleCardResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 单卡查询请求体
 **/
@Getter
@Setter
@ToString
public class QuerySingleCardRequest implements IsvRequest<QuerySingleCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String cardNum;//就诊卡卡号, 必填

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.querySingle";
    }
}
