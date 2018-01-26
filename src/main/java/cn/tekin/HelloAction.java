package cn.tekin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	 /*
	  * HelloAction 类构造方法
	  */
	 public HelloAction(){
		 
		// super(); //调用父类构造函数
		 
		 
	 }
	 
	 /*
	  * 重写 servlet的 doGet方法，实现 页面输出自定义内容
	  * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	  */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码为UTF-8
		request.setCharacterEncoding("utf-8");
		// 设置响应内容类型
		response.setContentType("text/html; charset=utf-8");
		  
		//定义浏览器输出对象 out
		PrintWriter out=response.getWriter();
		
		//定义输出字符
		String message = "Hello World, 你好世界！";
		// 在浏览器输出
		out.println(message);
		
		//在控制台输出
		System.out.println("OK");
		
		
		try {
			//关闭浏览器输出对象
			out.flush();
			out.close();
			destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 重写 doPost方法
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码为UTF-8
		request.setCharacterEncoding("utf-8");
		// 设置响应内容类型
		response.setContentType("text/html; charset=utf-8");

		//定义浏览器输出对象 out
		PrintWriter out=response.getWriter();
		
		//定义输出字符
		String message = "你好！欢迎使用post方法访问本页！";
		// 在浏览器输出
		out.println(message);
		
		try {
			//关闭浏览器输出对象
			out.flush();
			out.close();
			destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码为UTF-8
		req.setCharacterEncoding("utf-8");
		// 设置响应内容类型
		resp.setContentType("text/html; charset=utf-8");
		
		resp.getWriter().println("Welcome, 你试用 put 方式访问本页! ");
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码为UTF-8
			req.setCharacterEncoding("utf-8");
			// 设置响应内容类型
			resp.setContentType("text/html; charset=utf-8");
			
			resp.getWriter().println("Welcome, 你试用 delete 方式访问本页! ");
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override 
	public void destroy()
	  {
	      // 这里什么也不做，由父级方法实现
	  }

}
