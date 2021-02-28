package com.mock.response.banner;

import com.mock.model.IsvResponseData;
import lombok.Data;

/**
 * 挂缴小程序首页展示的该医院的banner轮播图
 **/
@Data
public class IndexBannerResponseData implements IsvResponseData {
    private String url;//图片url, http://xxx.jpg
}
