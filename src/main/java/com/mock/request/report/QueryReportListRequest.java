package com.mock.request.report;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.report.QueryReportListResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 就诊卡列表查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryReportListRequest implements IsvPageRequest<QueryReportListResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String cardNum;//就诊卡卡号
    private int pageIndex;//页码
    private int pageSize;//页条数

    @Override
    public String serviceName() {
        return "isvRequest.report.queryList";
    }
}
