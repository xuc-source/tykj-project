package com.mock.request.oauth;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.oauth.PhoneOauthResponseData;
import lombok.Data;

/**
 * 发送手机验证码请求
 **/
@Data
public class PhoneOauthRequest implements IsvRequest<PhoneOauthResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户id
    private String phoneNumber;//注册手机号

    @Override
    public String serviceName() {
        return "isvRequest.other.phoneOauth";
    }

}
