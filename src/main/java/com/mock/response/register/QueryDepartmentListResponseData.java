package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室列表查询回执
 **/
@Getter
@Setter
@ToString
public class QueryDepartmentListResponseData implements IsvResponseData {
    private String departmentId;//科室id
    private String name;//科室名称
    private Boolean hasChildren;//是否有子科室
    private Integer remain;//当天余号数量
}
