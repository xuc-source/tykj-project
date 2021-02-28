package com.mock.response.history;

import com.mock.model.IsvResponseData;
import lombok.Data;

/**
 * 就诊历史列表中的单个元素
 **/
@Data
public class VisitListResponseData implements IsvResponseData {

    private String visitId;//就诊历史id
    private String visitTime;//到诊时间（yyyy-MM-dd HH:mm:ss）
    private String doctorName;//医生姓名
    private String depName;//科室名称
    private String userName;//就诊卡姓名
    private String cardNum;//就诊卡卡号

}
