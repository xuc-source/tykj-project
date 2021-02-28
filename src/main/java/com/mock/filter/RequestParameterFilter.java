package com.mock.filter;

import com.mock.ParameterRequestWrapper;
import com.mock.dto.HeaderDTO;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 */
@Component
public class RequestParameterFilter  extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!CollectionUtils.isEmpty(getHeaderParams(request))){
            ParameterRequestWrapper wrapper = new ParameterRequestWrapper(request, getHeaderParams(request));
            filterChain.doFilter(wrapper, response);
            return;
        }
        filterChain.doFilter(request,response);
    }

    private Map<String,Object> getHeaderParams(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();
        String appId = request.getHeader("appId");
        String alipayUid = request.getHeader("alipayUid");
        if (StringUtils.isNotBlank(appId)){

            map.put("appId",appId);
        }
        if (StringUtils.isNotBlank(alipayUid)){

            map.put("userId",alipayUid);
        }

        return  map ;
    }
}
