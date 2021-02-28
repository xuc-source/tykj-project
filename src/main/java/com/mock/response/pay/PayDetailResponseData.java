package com.mock.response.pay;

import com.mock.model.IsvResponseData;
import lombok.Data;

/**
 * 查询订单详情的返回值
 **/
@Data
public class PayDetailResponseData implements IsvResponseData {
    private String depName;//科室名称
    private String outTradeNo;//商家订单号(区别于支付宝订单号)
    private String tradeNo;//支付宝订单号
    private Integer type;//订单类型标识，现阶段主要是挂号费和充值订单;1-挂号费订单 2-充值订单
    private String userName;//就诊卡姓名
    private String cardNum;//就诊卡卡号
    private String amount;//支付金额
    private String createTime;//创建时间;2020-01-01 9:00:00
    private String payTime;//支付时间（可为空）;2020-01-01 9:00:00
    private Integer payType;//支付渠道（TBD）;1-自费 2-医保 3-其他
    private Integer status;//订单状态;0-待支付 1-已支付 9-已取消
    private String idNum;//唯一识别号，根据订单类型不同含义不同。见本节开头对照。
    private boolean medicareBinded; //用户是否绑定了医保, 当订单是待支付状态, 会返回此字段, 前端根据此字段判断是否展示医保结算按钮


    private String customInfo; //自定义展示的内容, 是个json结构的string;具体展示的内容, isv可以根据自己的业务来展示 | "{'医生':'华佗', '科室':'德国骨科'}"
}
