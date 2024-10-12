package com.qyg.servlet;

import com.qyg.utils.*;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/execute_hql")
public class HqlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String hql = req.getParameter("hql");
        String result = "null";
        // 初始化 SQL 拦截器
        SQLInterceptor.init();
        if (!HibernateUtil.isEmpty(hql)) {
            try {
                // 根据 HQL 语句类型执行相应操作9
                if (hql.toLowerCase().startsWith("from") || hql.toLowerCase().startsWith("select")) {
                    // 查询操作
                    Session session = HibernateUtil.currentSession();
                    List list = session.createQuery(hql).list();
                    result = "";
                    // 获取执行结果
                    for (Object obj : list) {
                        result += obj.toString();
                    }
                } else {
                    throw new RuntimeException("暂时只支持数据查询语句。");
                }
            } catch (Exception e) {
                result = e.toString();
            }
        }

        // 将执行的 SQL 和结果传递到 JSP 页面
        req.setAttribute("executedSql", SQLInterceptor.getExecuteSql());
        req.setAttribute("result", result);
        req.setAttribute("hql", hql);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);


    }
}
