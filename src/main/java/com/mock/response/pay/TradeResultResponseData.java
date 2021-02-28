package com.mock.response.pay;


import com.mock.model.IsvResponseData;
import lombok.Data;

@Data
public class TradeResultResponseData implements IsvResponseData {
    private String status;//支付结果状态
}
