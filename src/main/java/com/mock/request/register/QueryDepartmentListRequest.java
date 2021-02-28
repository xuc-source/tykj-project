package com.mock.request.register;

import com.mock.model.IsvListRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.register.QueryDepartmentListResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室列表查询请求体
 **/
@Getter
@Setter
@ToString
public class QueryDepartmentListRequest implements IsvListRequest<QueryDepartmentListResponseData>, IAppIdRequest {

    private String appId;//医院小程序的AppId
    private Integer parentId;//父科室id
    private String keyWord;//模糊搜索关键字
    private String userId;

    @Override
    public String serviceName() {
        return "isvRequest.order.departmentList";
    }
}
