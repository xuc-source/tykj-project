package com.mock.request.register;

import com.mock.model.IsvListRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.register.QueryDepOrderSourceRemainResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室余号查询
 **/
@Getter
@Setter
@ToString
public class QueryDepOrderSourceRemainRequest implements IsvListRequest<QueryDepOrderSourceRemainResponseData>, IAppIdRequest {

    private String appId;//医院小程序的AppId
    private String depId;//科室id
    private String startDate;//查询起始日期
    private String endDate;//查询截止日期
    private String userId;

    @Override
    public String serviceName() {
        return "isvRequest.order.depOrderSourceRemain";
    }
}
