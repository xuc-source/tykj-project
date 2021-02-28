package com.mock.service;


import com.mock.model.PageVO;
import com.mock.request.card.*;
import com.mock.response.card.*;

/**
 * 就诊卡相关接口
 **/
public interface IsvMedicCardService {

    /**
     * 新增或者绑定就诊卡
     *
     * @param request 如果有cardNum那么就是绑定操作
     * @return 绑定结果
     **/
    CreateOrBindCardResponseData createOrBindMedicCard(CreateOrBindCardRequest request);

    /**
     * 更新就诊卡中的信息
     *
     * @param request 就诊卡需要更新的信息, cardNum必填
     * @return 更新后的结果
     **/
    UpdateCardResponseData updateMedicCard(UpdateCardRequest request);

    /**
     * 单卡查询
     *
     * @param request 就诊卡需要更新的信息, cardNum必填
     * @return 查询结果
     **/
    QuerySingleCardResponseData querySingleMedicCard(QuerySingleCardRequest request);

    /**
     * 默认就诊卡查询
     *
     * @param request
     * @return 查询结果
     **/
    QueryDefaultCardResponseData queryDefaultMedicCard(QueryDefaultCardRequest request);

    /**
     * 就诊卡列表查询
     *
     * @param request
     * @return 查询结果
     **/
    PageVO<QueryListCardResponseData> queryListMedicCard(QueryListCardRequest request);

    /**
     * 删除就诊卡
     *
     * @param request
     * @return 删除结果
     **/
    DeleteCardResponseData deleteMedicCard(DeleteCardRequest request);

    /**
     * 医保卡绑定
     *
     * @param request
     * @return 绑定结果
     **/
    BindMedInsuranceCardResponseData bindMedInsuranceCard(BindMedInsuranceCardRequest request);
}
