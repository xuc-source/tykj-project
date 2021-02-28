package com.mock.response.card;

import com.mock.model.IsvResponseData;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreateOrBindCardResponseData implements IsvResponseData {

    private String userId;//用户唯一id
    private String cardNum;//就诊卡卡号
    private String name;//姓名
    private String sex;//性别
    private String birthDay;//生日
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String balance;//卡内余额, 精确到小数点后两位
}
