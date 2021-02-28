package com.mock.service;

import com.mock.request.oauth.PhoneOauthRequest;
import com.mock.response.oauth.PhoneOauthResponseData;

/**
 * isv授权相关接口
 **/
public interface IsvOauthService {

    /**
     * 给指定手机号发送验证码
     * 后续可以用此验证码进行用户身份校验
     *
     * @param request 请求参数
     * @return 验证码过期时间
     **/
    PhoneOauthResponseData sendPhoneVerification(PhoneOauthRequest request);
}
