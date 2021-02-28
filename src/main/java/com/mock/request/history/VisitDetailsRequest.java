package com.mock.request.history;

import com.mock.model.IsvRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.history.VisitDetailsResponseData;
import lombok.Data;

/**
 * 就诊详情
 **/
@Data
public class VisitDetailsRequest implements IsvRequest<VisitDetailsResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;//用户id
    private String visitId;//就诊历史id

    @Override
    public String serviceName() {
        return "isvRequest.history.visitDetail";
    }

}
