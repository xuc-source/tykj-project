package com.mock.service;

import com.mock.model.PageVO;
import com.mock.request.pay.*;
import com.mock.response.pay.*;

/**
 * 支付相关接口
 **/
public interface IsvPayService {

    /**
     * 用于获取订单号，需要根据预约单、充值单等类型获取外部订单号提供给支付宝。
     * 由isv完成支付宝订单号的获取
     * https://yuque.antfin.com/iwc/kr9ge4/vevry3#aXTTW
     *
     * @param request 请求参数
     * @return 订单号及商家订单号
     **/
    TradeNoResponseData queryTradeNo(OutTradeNoRequest request);

    /**
     * 用于通知isv方用户支付结果。
     * isv方也可根据订单号单独调用支付宝接口查询。
     * 接口文档地址：https://opendocs.alipay.com/apis/api_1/alipay.trade.query/
     *
     * @param request 请求参数
     * @return 没有需要读取的返回内容
     **/
    void informTradeResult(TradeResultRequest request);

    /**
     * 根据订单号查询某一笔订单的订单详情
     * https://yuque.antfin.com/iwc/kr9ge4/vevry3#4H21p
     *
     * @param request 请求参数
     * @return 订单详情
     **/
    PayDetailResponseData queryPayDetail(PayDetailRequest request);

    /**
     * 查询指定用户,在指定医院的订单列表
     * https://yuque.antfin.com/iwc/kr9ge4/vevry3#Ix2CD
     *
     * @param request 请求参数
     * @return 订单列表
     **/
    PageVO<PayHistoryResponseData> queryPayHistory(PayHistoryRequest request);

    /***
     * 订单自费方式预结算查询
     * @param request
     * @return
     */
    ComputeSelfPaidOrderResponseData computeSelfPaidOrder(ComputeSelfPaidOrderRequest request);

    /**
     * 订单医保方式预结算查询
     * @param request
     * @return
     */
    ComputeMedicarePayOrderResponseData computeMedicarePayOrder(ComputeMedicarePayOrderRequest request);

    /**
     * 商家支付订单号获取(订单支付,自费/医保)
     * @param request
     * @return
     */
    TradeNoForOrderResponseData tradeNoForOrder(TradeNoForOrderRequest request);
}
