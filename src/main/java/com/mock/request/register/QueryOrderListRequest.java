package com.mock.request.register;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.register.QueryOrderListResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 预约单列表
 * 预约单列表请求体
 **/
@Getter
@Setter
@ToString
public class QueryOrderListRequest implements IsvPageRequest<QueryOrderListResponseData>, IAppIdRequest, IUserIdRequest {

    /**
     * ISV会根据传入的type类型, 查询相应的预约单
     **/
    public static final Integer EXPIRED_TYPE = 0;//已过期的预约类型
    public static final Integer NOT_STARTED_TYPE = 1;//未开始的预约类型
    public static final Integer ALL_TYPE = 2;//全部的预约类型

    private String appId;//医院小程序的AppId
    private String userId;//用户Id
//    private String startTime;//查询开始时间段
//    private String endTime;//查询截止时间段
//    private Integer type;//指定查询已过期或未开始的预约; 0-已过期 1-未开始 2-全部
    private String cardNum;//就诊卡卡号
    private int pageIndex;//页码
    private int pageSize;//页条数

    @Override
    public String serviceName() {
        return "isvRequest.order.orderList";
    }
}
