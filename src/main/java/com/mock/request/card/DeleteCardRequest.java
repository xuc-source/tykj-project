package com.mock.request.card;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.card.DeleteCardResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 删除就诊卡请求体
 **/
@Getter
@Setter
@ToString
public class DeleteCardRequest implements IsvRequest<DeleteCardResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户唯一id
    private String cardNum;//就诊卡卡号
    private String reason;//删卡原因

    @Override
    public String serviceName() {
        return "isvRequest.medicCard.delete";
    }
}
