package com.codeXie.filter;

import com.codeXie.pojo.UrlItem;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class PrivilegeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        System.out.println("uri:"+uri);
        if(uri.contains("login") || uri.contains("static") || uri.contains("main")||uri.endsWith("menuInfo")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            List<UrlItem> list = (List<UrlItem>) request.getSession().getAttribute("url");
            if(list != null) {
                for (UrlItem item : list) {
                    if (uri.endsWith(item.getUrlAddress())) {
                        filterChain.doFilter(servletRequest, servletResponse);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void destroy() {

    }
}
