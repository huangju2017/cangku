package com.hj.studentsSys.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hj.studentsSys.pojo.Student;
import com.hj.studentsSys.service.IStudentService;
import com.hj.studentsSys.service.impl.StudentService;

/**
 * 这是student对象的servlet容器
 * 
 * @author HuangJu
 *
 */
@SuppressWarnings("serial")
public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 处理请求和响应的乱码问题
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String cmd = req.getParameter("cmd");
		System.out.println(cmd);

		if ("register".equals(cmd)) {
			register(req, resp);
		} else if ("login".equals(cmd)) {
			login(req, resp);
		}
	}

	/**
	 * 完成登录的功能
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// 获取前台传递的数据
		String sname = req.getParameter("sname");
		String spassword = req.getParameter("spassword");
		IStudentService service = new StudentService();
		Student student = service.login(sname, spassword);
		if (student != null) {
			resp.getWriter().write("恭喜登录成功");
			return;
		} else {
			req.setAttribute("login_error_msg", "账号或密码有误，请检查账号密码");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			
		}
	}

	/**
	 * 这里处理注册的功能
	 * 
	 * @param req
	 * @param resp
	 */

	private void register(HttpServletRequest req, HttpServletResponse resp) {

		// 获取到所有的参数
		String sname = req.getParameter("sname");
		String spassword = req.getParameter("spassword");
		String age = req.getParameter("age");

		// 把数据封装到student对象中
		Student student = new Student(null, sname, spassword, age);
		System.out.println(student);

		// 获取到service对象，进行注册
		IStudentService service = new StudentService();

		int flag = service.register(student);
		try {
			if (flag == 1) {

				/*
				 * 问题：write()和print()的区别
				 */
				// 注册成功

				resp.getWriter().print("恭喜注册成功，3s后回到主页。。。");
				// 设置响应头
				resp.setHeader("refresh", "3,url=index.jsp");

			} else {
				// 这里注册失败的时候，需要信息提升给客户
				// 这里使用请求转发
				req.setAttribute("register_error_msg", "注册失败，请检测后重新注册...");
				req.getRequestDispatcher("/register").forward(req, resp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

}
