package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.a.UtilDateValueEncoder;

import dao.UserDaoImpl;
import pojos.User;
@WebServlet(urlPatterns="/signup",loadOnStartup=2)
public class RegisterVoterServlet extends HttpServlet{
	private UserDaoImpl userDao;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		System.out.println("in init of " + getClass());
		try {
			// create user dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// centralized err handling
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy of " + getClass());
		try {
			userDao.cleanUp();
		} catch (Exception e) {
			// inform WC about the err : OPTIONAL !
			throw new RuntimeException("err in destroy of " + getClass(), e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
//			String id =request.getParameter("id");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String em=request.getParameter("em");
			String password=request.getParameter("password");
			String date=request.getParameter("dob");
//			
			LocalDate db=LocalDate.parse(date);
			Period p=Period.between(db, LocalDate.now());
			if(p.getYears()>21) {
				Date dob=Date.valueOf(db);
				User newUSER=new User(fname,lname,em,password, dob);
				String fin=userDao.registerNewVoter(newUSER);
				if(fin.equals("Voter registered....")) {
					pw.print("<h4>Successful "+fin+" </h4>");
				}else {
					pw.print("<h4>UNSuccessful</h4>");
				}
			}
			else {
				pw.print("<h4>UNSuccessful</h4>");
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
	
			throw new ServletException("error in doPostRegeisterVoter "+getServletInfo(), e);
		}
		
		
	}
}
