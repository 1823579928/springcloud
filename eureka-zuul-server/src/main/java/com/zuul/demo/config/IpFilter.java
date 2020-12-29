package com.zuul.demo.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.zuul.demo.util.HttpServletRequestGetIp;
import com.zuul.demo.util.ResponseData;
import com.zuul.demo.util.ResponseDataUtil;
import com.zuul.demo.util.ResultEnums;
import io.micrometer.core.instrument.util.JsonUtils;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个 pre 过滤器，来实现 IP 黑名单的过滤操作
 * @author ZouJie
 * @Date 2020/7/30
 */
public class IpFilter extends ZuulFilter {
/**
     * 1）pre
     * 可以在请求被路由之前调用。适用于身份认证的场景，认证通过后再继续执行下面的流程。
     * 2）route
     * 在路由请求时被调用。适用于灰度发布场景，在将要路由的时候可以做一些自定义的逻辑。
     * 3）post
     * 在 route 和 error 过滤器之后被调用。这种过滤器将请求路由到达具体的服务之后执行。适用于需要添加响应头，记录响应日志等应用场景。
     * 4）error
     */


    // IP黑名单列表
    private List<String> blackIpList = Arrays.asList("192.168.1.191");

    public IpFilter() {
        super();
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        //优先级
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        //true 开启  false 关闭
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        //如果异常 获取异常信息
        Throwable throwable = ctx.getThrowable();
        System.out.println(2/0);
        String ip = HttpServletRequestGetIp.getIPAddress(ctx.getRequest());
        System.out.println(ip);
        // 在黑名单中禁用
        if (StringUtils.isNotBlank(ip) && blackIpList.contains(ip)) {
            ctx.setSendZuulResponse(false);
            ResponseData data = ResponseDataUtil.buildError( ResultEnums.ERROR.getCode(),ResultEnums.ERROR.getMsg(),"IP被冻结,禁止访问！");
            ctx.setResponseBody(data.toString());
            ctx.getResponse().setContentType("application/json; charset=utf-8");
            return null;
        }
        return null;
    }

}
