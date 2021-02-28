package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室医生查询回执
 **/
@Getter
@Setter
@ToString
public class QueryDepDoctorListResponseData implements IsvResponseData {
    private String doctorId;//医生id
    private String name;//医生姓名
    private String desc;//医生简介
    private String picUrl;//医生头像地址
    private Integer remain;//当日剩余号源数量
}
