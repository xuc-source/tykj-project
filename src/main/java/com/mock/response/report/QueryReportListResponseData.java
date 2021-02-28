package com.mock.response.report;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 就诊卡列表查询回执
 **/
@Getter
@Setter
@ToString
public class QueryReportListResponseData implements IsvResponseData {
    private String recordId;//检查流水号
    private String cardNum;//就诊卡卡
    private String userName;//姓名
    private String departmentName;//申请科室名称
    private String itemName;//报告名称
    private String applyDate;//申请日期
    private String status;//状态
    private String diagnosis;//诊断
}
