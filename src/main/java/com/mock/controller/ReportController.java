package com.mock.controller;

import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.report.QueryReportDetailRequest;
import com.mock.request.report.QueryReportListRequest;
import com.mock.response.report.QueryReportDetailResponseData;
import com.mock.response.report.QueryReportListResponseData;
import com.mock.service.IsvReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 */
@RestController
@RequestMapping("")
@Slf4j
public class ReportController {

    @Autowired
    private IsvReportService reportService;


    /**
     * 默认就诊卡查询
     *
     * @param request
     * @return
     */
    @PostMapping("isvRequest.report.queryDetail")
    public ResponseVO<QueryReportDetailResponseData> queryDetail(QueryReportDetailRequest request) {
    	if(StringUtils.isEmpty(request.getRecordId())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "recordId不能为空");
    	}
        return ResponseVO.success(reportService.queryReportDetail(request));
    }

    /**
     * 报告列表查询
     *
     * @param request
     * @return
     */
    @RequestMapping("isvRequest.report.queryList")
    public ResponseVO<PageVO<QueryReportListResponseData>> queryList(QueryReportListRequest request) {
    	
    	if(StringUtils.isEmpty(request.getCardNum())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageIndex())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageIndex不能为空");
    	}
    	if(StringUtils.isEmpty(request.getPageSize())) {
    		return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageSize不能为空");
    	}

        log.info("request is {}", request);

        PageVO<QueryReportListResponseData> data = reportService.queryReportList(request);


        return ResponseVO.success(data);
    }

}
