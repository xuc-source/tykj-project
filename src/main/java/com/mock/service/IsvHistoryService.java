package com.mock.service;

import com.mock.model.PageVO;
import com.mock.request.history.VisitDetailsRequest;
import com.mock.request.history.VisitListRequest;
import com.mock.response.history.VisitDetailsResponseData;
import com.mock.response.history.VisitListResponseData;

/**
 * isv就诊历史相关接口
 **/
public interface IsvHistoryService {

    /**
     * 查询isv保存的单次就诊信息细节
     *
     * @param request userId,visitId
     * @return 单次的就诊历史：isvRequest.order.orderDetail
     **/
    VisitDetailsResponseData queryVisitDetails(VisitDetailsRequest request);


    /**
     * 根据用户, 分页查询就诊历史列表
     *
     * @param request userId,pageIndex,pageSize
     * @return 分页的历史就诊信息, 其中的元素内容和 IsvHistoryService#queryVisitDetails() 目前来看是一样的
     **/
    PageVO<VisitListResponseData> queryVisitList(VisitListRequest request);
}
