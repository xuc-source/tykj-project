package com.mock.request.register;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.register.QueryDepDoctorListResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室医生查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryDepDoctorListRequest implements IsvPageRequest<QueryDepDoctorListResponseData>, IAppIdRequest {

    private String appId;//医院小程序的AppId
    private int pageIndex;//页码
    private int pageSize;//页条数

    private String depId;//科室id
    private String date;//查询日期
    private String userId;

    @Override
    public String serviceName() {
        return "isvRequest.order.depDoctorList";
    }
}
