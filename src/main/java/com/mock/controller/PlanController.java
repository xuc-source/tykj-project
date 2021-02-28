package com.mock.controller;

import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.register.QueryDepDoctorListRequest;
import com.mock.request.register.QueryDepOrderSourceRemainRequest;
import com.mock.request.register.QueryDepartmentListRequest;
import com.mock.request.register.QueryDoctorOrderSourceListRequest;
import com.mock.response.register.QueryDepDoctorListResponseData;
import com.mock.response.register.QueryDepOrderSourceRemainResponseData;
import com.mock.response.register.QueryDepartmentListResponseData;
import com.mock.response.register.QueryDoctorOrderSourceListResponseData;
import com.mock.service.IsvRegisterService;
import com.mock.utils.RegexUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 */
@RestController
@RequestMapping("")
@Slf4j
public class PlanController {

    @Autowired
    private IsvRegisterService isvRegisterService;

    /**
     * 科室列表查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.departmentList")
    public ResponseVO<List<QueryDepartmentListResponseData>> queryDepartmentList(QueryDepartmentListRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
        return ResponseVO.success(isvRegisterService.queryDepartmentList(request));
    }

    /**
     * 科室余号查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.depOrderSourceRemain")
    public ResponseVO<List<QueryDepOrderSourceRemainResponseData>> queryDepOrderSourceRemain(QueryDepOrderSourceRemainRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getDepId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "depId不能为空");
    	}
    	if(!StringUtils.isEmpty(request.getStartDate()) && !RegexUtil.isValidDate(request.getStartDate())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "起始日期格式错误");
    	}
    	if(!StringUtils.isEmpty(request.getEndDate()) && !RegexUtil.isValidDate(request.getEndDate())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "结束日期格式错误");
    	}
        return ResponseVO.success(isvRegisterService.queryDepOrderSourceRemain(request));
    }

    /**
     * 科室医生查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.depDoctorList")
    public ResponseVO<PageVO<QueryDepDoctorListResponseData>> queryDepDoctorList(QueryDepDoctorListRequest request) {
    	log.info("request is {}", request);
    	
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getDepId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "depId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageIndex())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageIndex不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageSize())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageSize不能为空");
    	}
    	
    	if(!StringUtils.isEmpty(request.getDate()) && !RegexUtil.isValidDate(request.getDate())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "日期格式错误");
    	}
    	
        PageVO<QueryDepDoctorListResponseData> data = isvRegisterService.queryDepDoctorList(request);


        return ResponseVO.success(data);

    }

    /**
     * 医生号源查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.order.doctorOrderSourceList")
    public ResponseVO<List<QueryDoctorOrderSourceListResponseData>> queryDoctorOrderSourceList(QueryDoctorOrderSourceListRequest request) {
    	if(StringUtils.isEmpty(request.getAppId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "APPID不能为空");
    	}
    	if(StringUtils.isEmpty(request.getUserId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "userId不能为空");
    	}
    	if(StringUtils.isEmpty(request.getDepId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "depId不能为空");
    	}
    	if(!StringUtils.isEmpty(request.getStartTime()) && !RegexUtil.isValidDate(request.getStartTime())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "起始日期格式错误");
    	}
    	if(!StringUtils.isEmpty(request.getEndTime()) && !RegexUtil.isValidDate(request.getEndTime())) {
    		return ResponseVO.fail(ErrorCode.PARAM_FORMAT_ERROR.getCode(), "结束日期格式错误");
    	}
        return ResponseVO.success(isvRegisterService.queryDoctorOrderSourceList(request));
    }
}
