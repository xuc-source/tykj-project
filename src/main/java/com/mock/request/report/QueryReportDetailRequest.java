package com.mock.request.report;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.report.QueryReportDetailResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 就诊卡列表查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryReportDetailRequest implements IsvRequest<QueryReportDetailResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String recordId;//检查流水号

    @Override
    public String serviceName() {
        return "isvRequest.report.queryDetail";
    }
}
