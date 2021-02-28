package com.mock.service;


import com.mock.model.PageVO;
import com.mock.request.register.*;
import com.mock.response.register.*;

import java.util.List;

/**
 * 预约挂号相关接口
 */
public interface IsvRegisterService {
    /**
     * 科室列表查询
     *
     * @param request
     * @return 查询结果
     **/
    List<QueryDepartmentListResponseData> queryDepartmentList(QueryDepartmentListRequest request);

    /**
     * 科室余号查询
     *
     * @param request
     * @return 查询结果
     **/
    List<QueryDepOrderSourceRemainResponseData> queryDepOrderSourceRemain(QueryDepOrderSourceRemainRequest request);

    /**
     * 科室医生查询
     *
     * @param request
     * @return 查询结果
     **/
    PageVO<QueryDepDoctorListResponseData> queryDepDoctorList(QueryDepDoctorListRequest request);

    /**
     * 医生号源查询
     *
     * @param request
     * @return 查询结果
     **/
    List<QueryDoctorOrderSourceListResponseData> queryDoctorOrderSourceList(QueryDoctorOrderSourceListRequest request);

    /**
     * 挂号确认
     *
     * @param request
     * @return 查询结果
     **/
    OrderConfirmResponseData orderConfirm(OrderConfirmRequest request);

    /**
     * 预约单详情
     *
     * @param request
     * @return 查询结果
     **/
    QueryOrderDetailResponseData queryOrderDetail(QueryOrderDetailRequest request);

    /**
     * 预约单列表查询
     *
     * @param request
     * @return 查询结果
     **/
    PageVO<QueryOrderListResponseData> queryOrderList(QueryOrderListRequest request);

    /**
     * 取消预约
     *
     * @param request
     * @return 查询结果
     **/
    CancelOrderResponseData cancelOrder(CancelOrderRequest request);
}
