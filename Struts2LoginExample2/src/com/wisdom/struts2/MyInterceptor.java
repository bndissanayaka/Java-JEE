package com.wisdom.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init");
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		/* let us do some pre-processing 
		 * pre process before action is called*/
		String output = "Pre-Processing";
		System.out.println(output);
		/* let us call action or next interceptor */
		String result = invocation.invoke();
		/* let us do some post-processing 
		 * post process after processing action on the way back from server*/
		output = "Post-Processing";
		System.out.println(output);
		return result;
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy");
	}
}
