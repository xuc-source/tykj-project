package com.mock.response.report;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class QueryReportDetailResponseData implements IsvResponseData {
    private String recordId;//检查流水号
    private String cardNum;//就诊卡卡号
    private String userName;//姓名
    private String userSex;//性别
    private String userAge;//userAge
    private String diagnosis;//诊断
    private String departmentId;//申请科室代码
    private String departmentName;//申请科室名称
    private String itemName;//报告名称
    private String applyDoctorId;//申请医生工号
    private String applyDoctorName;//申请医生
    private String applyDate;//申请日期
    private String reportDate;//报告日期
    private String confirmDate;//审核日期
    private String reportDoctorId;//报告医生工号
    private String reportDoctorName;//报告医生
    private String confirmDoctorId;//审核医生工号
    private String confirmDoctorName;//审核医生
    private String reportPdfUrl;//PDF类型报告文件地址
    private String reportImageUrl;//图片类型报告文件地址
    private List<ReportItem> reportItemList;    //报告项
}
