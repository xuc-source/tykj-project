package com.mock.response.oauth;

import com.mock.model.IsvResponseData;
import lombok.Data;

/**
 * 发送手机验证码请求成功之后, isv返回的验证码有效时间
 **/
@Data
public class PhoneOauthResponseData implements IsvResponseData {

    private String expire;//验证码过期时间，单位秒
}
