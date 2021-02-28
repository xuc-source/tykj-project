package com.mock.response.pay;

import com.mock.model.IsvResponseData;
import lombok.Data;

import java.util.List;

@Data
public class ComputeSelfPaidOrderResponseData implements IsvResponseData {
    private String totalAmount;    //订单总金额, 精确到小数点后2位; (仅用来展示, 付款不以此为准)
    private String cardBalance;    //就诊卡内余额, 精确到小数点后2位; (仅用来展示, 付款不以此为准)
    private String payWithBalanceAmount;    //计算使用卡内余额后, 展示给用户看的还需要支付的金额; (拉起支付需要和此金额一样)
    private String payWithoutBalanceAmount;    //计算不使用卡内余额的情况下, 展示给用户看的还需要支付的金额; (拉起支付需要和此金额一样)
    private List<OrderItem> orderItemList;    //订单的 收费项目 详细信息
}
