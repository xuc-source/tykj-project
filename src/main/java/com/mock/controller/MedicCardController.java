package com.mock.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.constant.Constant;
import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.card.CreateOrBindCardRequest;
import com.mock.request.card.DeleteCardRequest;
import com.mock.request.card.QueryDefaultCardRequest;
import com.mock.request.card.QueryListCardRequest;
import com.mock.request.card.QuerySingleCardRequest;
import com.mock.request.card.UpdateCardRequest;
import com.mock.response.card.CreateOrBindCardResponseData;
import com.mock.response.card.DeleteCardResponseData;
import com.mock.response.card.QueryDefaultCardResponseData;
import com.mock.response.card.QueryListCardResponseData;
import com.mock.response.card.QuerySingleCardResponseData;
import com.mock.response.card.UpdateCardResponseData;
import com.mock.service.IsvMedicCardService;
import com.mock.utils.RegexUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * @Desc
 */
@RestController
@RequestMapping("")
@Slf4j
public class MedicCardController {

    @Autowired
    private IsvMedicCardService medicCardService;


    /**
     * 绑定或新增就诊卡
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.medicCard.createOrBind")
    public ResponseVO<CreateOrBindCardResponseData> createOrBind(CreateOrBindCardRequest request) {
    	
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	
    	if(request.getType() == null) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "绑定类型不能为空");
    	}
    	
    	if(request.getType() == Constant.CARD_BIND_TYPE_BIND && StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "就诊卡卡号不能为空");
    	}
    	
    	if(request.getType() == null) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "就诊卡绑定类型不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}

    	if(StringUtils.isEmpty(request.getName())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "用户姓名不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getSex())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "性别名不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getBirthDay())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "出生日期不能为空");
    	}
    	
    	if(!RegexUtil.isValidDate(request.getBirthDay())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "出生日期格式错误");
    	}
    	
    	if(StringUtils.isEmpty(request.getIdCardNo())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "身份证号不能为空");
    	}
    	
    	if(!RegexUtil.isIdCardNo(request.getIdCardNo())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "身份证格式错误");
    	}
    	
    	if(StringUtils.isEmpty(request.getPhoneNumber())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "手机号码不能为空");
    	}

    	if(!RegexUtil.isMobile(request.getPhoneNumber())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "手机号格式错误");
    	}
    	
    	if(StringUtils.isEmpty(request.getRelationShip())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "关系不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getAuthCode())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "验证码不能为空");
    	}
    	
        return ResponseVO.success(medicCardService.createOrBindMedicCard(request));
    }

    /**
     * 修改就诊卡
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.medicCard.update")
    public ResponseVO<UpdateCardResponseData> updateMedicCard(UpdateCardRequest request) {
    	
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	
    	if(request.getClinicCardId()== null) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "clinicCardId不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "就诊卡卡号不能为空");
    	}

    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getPhoneNumber())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "手机号码不能为空");
    	}

    	if(!RegexUtil.isMobile(request.getPhoneNumber())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "手机号格式错误");
    	}
    	
    	if(StringUtils.isEmpty(request.getRelationShip())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "关系不能为空");
    	}
    	
    	if(StringUtils.isEmpty(request.getAuthCode())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "验证码不能为空");
    	}
        return ResponseVO.success(medicCardService.updateMedicCard(request));
    }

    /**
     * 单卡查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.medicCard.querySingle")
    public ResponseVO<QuerySingleCardResponseData> querySingle(QuerySingleCardRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
        return ResponseVO.success(medicCardService.querySingleMedicCard(request));
    }

    /**
     * 默认就诊卡查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.medicCard.defaultCard")
    public ResponseVO<QueryDefaultCardResponseData> defaultCard(QueryDefaultCardRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
        return ResponseVO.success(medicCardService.queryDefaultMedicCard(request));
    }

    /**
     * 我的证件
     *
     * @param request
     * @return
     */
    @PostMapping("miniProRequest.medicCard.myCard")
    public ResponseVO<QueryDefaultCardResponseData> myCard(QueryDefaultCardRequest request) {

        return ResponseVO.success(medicCardService.queryDefaultMedicCard(request));
    }

    /**
     * 就诊卡列表
     *
     * @param request
     * @return
     */
    @RequestMapping("isvRequest.medicCard.queryList")
    public ResponseVO<PageVO<QueryListCardResponseData>> queryList(QueryListCardRequest request) {
    	
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(request.getPageSize() == 0) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pagesize不能为空或者是0");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}


        log.info("request is {}", request);

        PageVO<QueryListCardResponseData> data = medicCardService.queryListMedicCard(request);


        return ResponseVO.success(data);
    }

    /**
     * 删除就诊卡
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.medicCard.delete")
    public ResponseVO<DeleteCardResponseData> delete(DeleteCardRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
        if (StringUtils.isBlank(request.getCardNum())) {
        	return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "就诊卡号不能为空");
        }
        return ResponseVO.success(medicCardService.deleteMedicCard(request));
    }


}
