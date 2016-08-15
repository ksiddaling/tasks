package com.shingu.controller;

import java.io.Serializable; 

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.service.LoginService;

@Component
@ManagedBean(name = "loginBean")
// @SessionScoped
@Scope("session")
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 5888150115213241332L;
	private String name;
	private String password;
	private boolean loggedIn;
	private static boolean attendanceLoggedIn;

	@Autowired
	LoginService loginService;

	public LoginService getLoginService() {
		System.out.println("getLoginService");
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
		System.out.println("setLoginService");
	}

	public String getName() {
		System.out.println("getName() :" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name) :" + name);
	}

	public String getPassword() {
		System.out.println("getPassword :" + password);
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setPassword :" + password);
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public static boolean isAttendanceLoggedIn() {
		return attendanceLoggedIn;
	}

	public static void setAttendanceLoggedIn(boolean attendanceLoggedInc) {
		attendanceLoggedIn = attendanceLoggedInc;
	}

	@Override
	public String toString() {
		return "LoginBean [name=" + name + ", password=" + password + "]";
	}

	public LoginBean() {
		super();
	}

	public String login() {
		System.out.println("login starts");

		String[] result = loginService.login(name, password);

		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context
				.getExternalContext().getRequest();
		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("userid", result[0]);

		System.out.println("httpSession.getAttribute(userid) : "
				+ httpSession.getAttribute("userid"));
		System.out.println("session id :" + httpSession.getId());
		System.out.println("is logged In : " + isLoggedIn());
		/*
		 * System.out.println("httpSession.getAttribute(loginBean) : " +
		 * httpSession.getAttribute("loginBean").toString());
		 */

		if (result[1] != null) {
			setLoggedIn(true);
			return result[1];
		}
		FacesMessage msg = new FacesMessage("incorrect userName or password!",
				"ERROR MSG");
		msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		FacesContext.getCurrentInstance().addMessage(null, msg);

		// To login page
		return result[1];

	}

	public String logout() {
		
		loginService.logOut();

		final FacesContext context = FacesContext.getCurrentInstance();
		final ExternalContext ec = context.getExternalContext();
		final HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		System.out.println("request.isRequestedSessionIdValid() : "
				+ request.isRequestedSessionIdValid());
		request.getSession(false).invalidate();
		System.out.println("request.isRequestedSessionIdValid() : "
				+ request.isRequestedSessionIdValid());
		return "login";
	}

}
