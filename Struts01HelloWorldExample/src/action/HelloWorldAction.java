package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import form.HelloWorldForm;

public class HelloWorldAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HelloWorldForm hwForm = (HelloWorldForm) form;
		hwForm.setMessage("Hello World Struts 01");
		return mapping.findForward("success");
	}
}