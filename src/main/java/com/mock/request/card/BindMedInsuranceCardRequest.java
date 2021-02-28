package com.mock.request.card;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.BindMedInsuranceCardResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 绑定医保卡请求体
 **/
@Getter
@Setter
@ToString
public class BindMedInsuranceCardRequest implements IsvRequest<BindMedInsuranceCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String name;//姓名
    private String sex;//性别
    private String birthDay;//生日
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String medInsuranceNum;//医保卡识别号

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.medInsuranceBind";
    }
}
