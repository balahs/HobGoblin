package com.worldgate.request;

import com.worldgate.util.LogUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {


    private static final long serialVersionUID = 1159764852861289598L;


    public FrontController() {
        super();
    }

    public void init(ServletConfig config) {
    }

    public void destroy() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LogUtil.log.info("hit FC");
        req.getRequestDispatcher(RequestHelper.process(req));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LogUtil.log.info("hit FC");

        req.getRequestDispatcher(RequestHelper.process(req));
    }
}
