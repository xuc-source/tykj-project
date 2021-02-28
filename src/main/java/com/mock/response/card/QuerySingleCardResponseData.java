package com.mock.response.card;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 单卡查询请求返回
 **/

@Getter
@Setter
@ToString
public class QuerySingleCardResponseData implements IsvResponseData {
    private String cardNum;//就诊卡卡号
    private String type;//标记查询卡类型
    private String name;//姓名
    private String sex;//性别
    private String birthDay;//生日
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String balance;//卡内余额
    private String relationShip; // 关系
    private String defaultCard;//是否是默认就诊卡
}
