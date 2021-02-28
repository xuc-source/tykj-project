package com.mock.request.history;

import com.mock.model.IsvPageRequest;
import com.mock.request.IAppIdRequest;
import com.mock.request.IUserIdRequest;
import com.mock.response.history.VisitListResponseData;
import lombok.Data;

/**
 * 就诊历史列表请求
 **/
@Data
public class VisitListRequest implements IsvPageRequest<VisitListResponseData>, IAppIdRequest, IUserIdRequest {

    private String appId;//医院小程序的AppId
    private String userId;
    private String cardNum;//就诊卡卡号
    private int pageIndex;
    private int pageSize;

    @Override
    public String serviceName() {
        return "isvRequest.history.visitList";
    }
}
