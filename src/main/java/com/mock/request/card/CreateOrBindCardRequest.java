package com.mock.request.card;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.CreateOrBindCardResponseData;
import lombok.Data;

/**
 * 创建或者绑定就诊卡
 **/
@Data
public class CreateOrBindCardRequest implements IsvRequest<CreateOrBindCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private Integer type;//标志新建or绑定操作; 0=新建 1=绑定
    private String cardNum;//就诊卡卡号，仅绑定操作时有效
    private String name;//姓名
    private String sex;//性别; 男|女
    private String birthDay; //生日（yyyy-MM-dd）
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String authCode;//验证码
    private String relationShip;//关系
    private String defaultCard;//是否默认

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.createOrBind";
    }
}
