package com.mock.controller;

import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.history.VisitDetailsRequest;
import com.mock.request.history.VisitListRequest;
import com.mock.response.history.VisitDetailsResponseData;
import com.mock.response.history.VisitListResponseData;
import com.mock.service.IsvHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 */
@RestController
@Slf4j
public class VisitController {

    @Autowired
    private IsvHistoryService isvHistoryService;

    /**
     * 就诊详情
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.history.visitDetail")
    public ResponseVO<VisitDetailsResponseData> queryVisitDetails(VisitDetailsRequest request) {
    	if(StringUtils.isEmpty(request.getVisitId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "visitId不能为空");
    	}
    	
        return ResponseVO.success(isvHistoryService.queryVisitDetails(request));
    }


    /**
     * 就诊历史
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.history.visitList")
    public ResponseVO<PageVO<VisitListResponseData>> queryVisitList(VisitListRequest request) {
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageIndex())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageIndex不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageSize())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageSize不能为空");
    	}
    	
        PageVO<VisitListResponseData> data = isvHistoryService.queryVisitList(request);


        return ResponseVO.success(data);
    }
}
