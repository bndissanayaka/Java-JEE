package com.wisdom.registerEx.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wisdom.regsterEx.form.RegisterForm;

public class RegisterAction extends org.apache.struts.action.Action{
	
	public ActionForward excecute(ActionMapping mapping, ActionForm form, HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		ActionForward forward;
		RegisterForm registerForm = (RegisterForm)form;
		String fname = registerForm.getFname();
		String lname = registerForm.getLname();
		if (!fname.equals(lname)) {
			 forward = mapping.findForward("success");
		}else
		{
			 forward = mapping.findForward("fail");
		}
		return forward;
	}
	

}
