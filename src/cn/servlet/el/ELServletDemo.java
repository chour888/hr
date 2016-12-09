package cn.servlet.el;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.servlet.vo.Company;
import cn.servlet.vo.Dept;

public class ELServletDemo extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Dept> all = new ArrayList<Dept>();
		for (int x = 0 ; x < 15; x++)
		{
		Dept vo = new Dept();
		vo.setDeptno(10 + x);
		vo.setDname("ACCOUNT - " + x);
		vo.setLoc("New York - " + x);
		Company c = new Company();
		c.setName("R' - " + x);
		c.setUrl("www.china.com - " +x);
		vo.setCp(c);
		all.add(vo);
		}
		request.setAttribute("allDepts", all);
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
