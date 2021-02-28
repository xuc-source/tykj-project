package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 科室余号查询
 **/
@Getter
@Setter
@ToString
public class QueryDepOrderSourceRemainResponseData implements IsvResponseData {
    private String date;//挂号日期
    private Integer remain;//剩余号源数量
}
