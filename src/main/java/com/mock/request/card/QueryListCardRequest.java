package com.mock.request.card;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.QueryListCardResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 就诊卡列表查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryListCardRequest implements IsvPageRequest<QueryListCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private int type;//标记查询卡类型int
    private String authCode;//授权码
    private int pageIndex;//页码
    private int pageSize;//页条数

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.queryList";
    }
}
