package edu.csu.dutychain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanjuefei
 * @date 2020/5/23 0023
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter());
        filterChain.addFilter(new FooterFilter());

        Request request = new Request("996 makes me 难过");
        Response response = new Response("");
        filterChain.doFilter(request, response);
        System.out.println("返回："+ response.content);
    }
}

interface Filter {
    void doFilter(Request req, Response resp, FilterChain filterChain);
}


class Request {
    String content;

    public Request(String content) {
        this.content = content;
    }
}

class Response {
    String content;

    public Response(String content) {
        this.content = content;
    }
}

class HTMLFilter implements Filter{

    @Override
    public void doFilter(Request req, Response resp, FilterChain filterChain) {
        req.content = req.content.replaceAll("996", "955");
        System.out.println("from HTML Filter: "+req.content);
        filterChain.doFilter(req, resp);
        resp.content += "---htmlFilter ";
    }
}

class FooterFilter implements Filter{

    @Override
    public void doFilter(Request req, Response resp, FilterChain filterChain) {
        req.content = req.content.replaceAll("难过", "开心");
        System.out.println("from Footer Filter: "+req.content);
        filterChain.doFilter(req, resp);
        resp.content += "--footerFilter ";
    }
}

class FilterChain {
    List<Filter> filterList = new ArrayList<>();
    int idx = 0;
    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void doFilter(Request req, Response resp) {
        System.out.println(idx);
        if(idx >= filterList.size()) {
            return;
        }
        filterList.get(idx++).doFilter(req, resp, this);
        //idx++;
    }
}
