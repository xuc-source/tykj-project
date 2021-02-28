package com.mock.service;


import com.mock.model.PageVO;
import com.mock.request.report.QueryReportDetailRequest;
import com.mock.request.report.QueryReportListRequest;
import com.mock.response.report.QueryReportDetailResponseData;
import com.mock.response.report.QueryReportListResponseData;

/**
 * 就诊卡相关接口
 **/
public interface IsvReportService {

    /**
     * 默认就诊卡查询
     *
     * @param request
     * @return 查询结果
     **/
    QueryReportDetailResponseData queryReportDetail(QueryReportDetailRequest request);

    /**
     * 就诊卡列表查询
     *
     * @param request
     * @return 查询结果
     **/
    PageVO<QueryReportListResponseData> queryReportList(QueryReportListRequest request);

}
