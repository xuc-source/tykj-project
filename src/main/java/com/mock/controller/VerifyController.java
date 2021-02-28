package com.mock.controller;

import com.mock.exception.ErrorCode;
import com.mock.model.ResponseVO;
import com.mock.request.oauth.PhoneOauthRequest;
import com.mock.response.oauth.PhoneOauthResponseData;
import com.mock.service.IsvOauthService;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 */
@RestController
@Slf4j
public class VerifyController {

    @Autowired
    private IsvOauthService isvOauthService;

    /**
     * 发送手机验证码
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.other.phoneOauth")
    public ResponseVO<PhoneOauthResponseData> sendPhoneVerification(PhoneOauthRequest request) {
    	if(StringUtils.isEmpty(request.getPhoneNumber())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "phoneNumber不能为空");
    	}

        return ResponseVO.success(isvOauthService.sendPhoneVerification(request));
    }
}
