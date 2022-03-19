package com.spring.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class CommonUtil {

	public void alert(HttpServletResponse response, String msg) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
        out.println("<script>alert('" + msg + "');</script>");
        out.flush();
	}
}
