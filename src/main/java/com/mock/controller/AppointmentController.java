package com.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.register.CancelOrderRequest;
import com.mock.request.register.OrderConfirmRequest;
import com.mock.request.register.QueryOrderDetailRequest;
import com.mock.request.register.QueryOrderListRequest;
import com.mock.response.register.CancelOrderResponseData;
import com.mock.response.register.OrderConfirmResponseData;
import com.mock.response.register.QueryOrderDetailResponseData;
import com.mock.response.register.QueryOrderListResponseData;
import com.mock.service.IsvRegisterService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Desc
 */
@RestController
@Slf4j
public class AppointmentController {

    @Autowired
    private IsvRegisterService isvRegisterService;

    /**
     * 挂号确认
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.orderConfirm")
    public ResponseVO<OrderConfirmResponseData> orderConfirm(OrderConfirmRequest request) {
    	log.info("request is {}", request);
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
    	if(StringUtils.isEmpty(request.getDoctorId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "doctorId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getOrderSourceId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "orderSourceId不能为空");
    	}
    	
        return ResponseVO.success(isvRegisterService.orderConfirm(request));
    }

    /**
     * 预约单列表
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.orderList")
    public ResponseVO<PageVO<QueryOrderListResponseData>> queryOrderList(QueryOrderListRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageIndex())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageIndex不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageSize())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageSize不能为空");
    	}

        PageVO<QueryOrderListResponseData> data = isvRegisterService.queryOrderList(request);
        return ResponseVO.success(data);

    }

    /**
     * 预约单详情
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.orderDetail")
    public ResponseVO<QueryOrderDetailResponseData> queryOrderDetail(QueryOrderDetailRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getOrderId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "orderId不能为空");
    	}
        return ResponseVO.success(isvRegisterService.queryOrderDetail(request));
    }

    /**
     * 取消预约单
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.cancelOrder")
    public ResponseVO<CancelOrderResponseData> cancelOrder(CancelOrderRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getOrderId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "orderId不能为空");
    	}
        return ResponseVO.success(isvRegisterService.cancelOrder(request));
    }
}
