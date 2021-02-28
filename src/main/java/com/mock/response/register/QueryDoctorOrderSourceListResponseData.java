package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 医生号源查询
 **/
@Getter
@Setter
@ToString
public class QueryDoctorOrderSourceListResponseData implements IsvResponseData {
    private String orderSourceId;//号源id
    private String startTime;//号源开始时间段
    private String endTime;//号源截止时间段
    private String cost;//挂号费用
    private Integer remain;//剩余数量
}
