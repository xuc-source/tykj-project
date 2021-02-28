package com.mock.response.card;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryDefaultCardResponseData implements IsvResponseData {
    private String cardNum;//就诊卡卡号
    private String type;//标记查询卡类型; 0-普通卡 1-医保卡
    private String name;//姓名
    private String sex;//性别
    private String birthDay;//生日 （yyyy-MM-dd）
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String balance;//卡内余额; 精确到小数点后两位
    private String relationShip; // 关系
    private String defaultCard;//是否是默认就诊卡
}
