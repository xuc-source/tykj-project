package com.mock.response.register;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 取消预约返回体
 **/
@Getter
@Setter
@ToString
public class CancelOrderResponseData implements IsvResponseData {

    private Boolean isSuccess;
}
