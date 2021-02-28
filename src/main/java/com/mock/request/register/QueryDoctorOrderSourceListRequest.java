package com.mock.request.register;

import com.mock.model.IsvListRequest;
import com.mock.request.IAppIdRequest;
import com.mock.response.register.QueryDoctorOrderSourceListResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 医生号源查询
 **/
@Getter
@Setter
@ToString
public class QueryDoctorOrderSourceListRequest implements IsvListRequest<QueryDoctorOrderSourceListResponseData>, IAppIdRequest {

    private String appId;//医院小程序的AppId
    private String depId;//科室ID
    private String doctorId;//医生唯一识别号
    private String startTime;//号源开始时间（yyyy-MM-dd）
    private String endTime;//号源截止时间（yyyy-MM-dd）
    private String userId;

    @Override
    public String serviceName() {
        return "isvRequest.order.doctorOrderSourceList";
    }
}
