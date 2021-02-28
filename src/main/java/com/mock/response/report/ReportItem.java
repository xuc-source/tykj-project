package com.mock.response.report;

import lombok.Data;

@Data
public class ReportItem {
    private String itemName;            //项目名称
    private String txtVal;             //结果
    private String pnFlag;             //正常标志
    private String reference;             //参考值
}
