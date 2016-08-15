package com.shingu.common;

import java.io.IOException;

import javax.faces.application.ViewExpiredException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shingu.controller.LoginBean;

/**
 * The Class RestrictPageFilter.
 */
public class RestrictPageFilter implements Filter {

	/** The Constant LOGGER. */
	// static final Logger LOGGER = Logger.getLogger(RestrictPageFilter.class);

	/** The Constant LOGIN_PAGE. */
	private static final String LOGIN_PAGE = "faces/pages/login.xhtml";

	/** The Constant LOGIN_OUT. */
	private static final String LOGIN_OUT = "faces/pages/Logout.xhtml";

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(final FilterConfig filterConfig) throws ServletException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(final ServletRequest iRequest, final ServletResponse iResponse, final FilterChain iFilterChain)
			throws IOException, ServletException {

		HttpServletRequest requestHttp = (HttpServletRequest) iRequest;
		HttpServletResponse responseHttp = (HttpServletResponse) iResponse;

		try {
			System.out.println("doFilter() starts");
			if ((iRequest instanceof HttpServletRequest) && (iResponse instanceof HttpServletResponse)) {

				responseHttp.setHeader("X-UA-Compatible", "IE=EmulateIE8");
				responseHttp.setContentType("charset=UTF-8");
				String requestPath1 = ((HttpServletRequest) iRequest).getRequestURI();
				System.out.println("requestPath is :" + requestPath1);

				if (requestPath1.contains(LOGIN_OUT)) {
					System.out.println("requestPath1: " + requestPath1);
					// LOGGER.info("requestPath1: " + requestPath1);
					requestHttp.getSession().invalidate();
					String timeoutUrl = requestHttp.getContextPath() + "/" + LOGIN_PAGE;
					System.out.println("timeoutUrl" + timeoutUrl);
					// LOGGER.info("timeoutUrl" + timeoutUrl);
					responseHttp.sendRedirect(timeoutUrl);

				} else {
					if (checkResource(requestHttp)) {

						if (!checkSession(requestHttp)) {

							System.out.println("iRequest.getSession().getAttribute(userid) : "
									+ ((HttpServletRequest) iRequest).getSession().getAttribute("userid"));

							System.out.println("3 !checkSession(requestHttp) : " + !checkSession(requestHttp));

							String timeoutUrl = requestHttp.getContextPath() + "/" + LOGIN_PAGE;

							responseHttp.sendRedirect(timeoutUrl);

							System.out.println(timeoutUrl + ": timeOutUrl");
						}
					}
					System.out.println("before iFilterChain.dofilter()");
					iFilterChain.doFilter(iRequest, iResponse);
					System.out.println("after ifilterChain.dofilter()");
				}
			}

		} catch (ViewExpiredException ex) {

			String timeoutUrl = requestHttp.getContextPath() + "/" + LOGIN_PAGE;
			System.out.println("timeoutUrl" + timeoutUrl);
			// LOGGER.info("timeoutUrl" + timeoutUrl);
			responseHttp.sendRedirect(timeoutUrl);

		}

	}

	/**
	 * Check resource.
	 * 
	 * @param iRequest
	 *            the i request
	 * @return true, if successful
	 */
	private boolean checkResource(final HttpServletRequest iRequest) {
		String requestPath = iRequest.getRequestURI();
		System.out.println("chechResource : " + !requestPath.contains(LOGIN_PAGE));
		return (!requestPath.contains(LOGIN_PAGE));
	}

	/**
	 * Check session.
	 * 
	 * @param iRequest
	 *            the i request
	 * @return true, if successful
	 */
	private boolean checkSession(final HttpServletRequest iRequest) {
		LoginBean loginInBean = (LoginBean) iRequest.getSession().getAttribute("loginBean");
		return loginInBean != null && loginInBean.getName() != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy() filter");
	}

}