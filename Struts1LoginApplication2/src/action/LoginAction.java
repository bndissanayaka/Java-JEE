package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import dbhandler.DBHandler;
import dbhandler.Login;

import org.apache.struts.action.ActionForward;
import form.LoginForm;
import org.apache.log4j.Logger;

public class LoginAction extends org.apache.struts.action.Action {
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	static final Logger logger = Logger.getLogger(LoginAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		Login user = new Login();
		
		user.setUsername(loginForm.getUserName());
		user.setPassword(loginForm.getPassword());
		
		logger.info("--firstName-->" );
		logger.info("--lastName-->" );
		logger.info("--email-->" );
		logger.info("--userName-->" );
		logger.info("--password-->" );
		
		DBHandler dbhndl = new DBHandler();
		//when calling dbhndl.handelConnection() previously we used loginForm as the method parameter.
		//like this : (boolean result = dbhndl.handelConnection(loginForm);)
		//but it's not a good approach; as it takes front end object to back end.
		//It's not a norm to take front end obs to back end as it makes the two tires tightly coupled .
		//So we write a new class as Login, it's a pojo again. Set input values using form object getters as;
		//user.setUsername(loginForm.getUserName());
		//then pass Login class object to dbhndl.handelConnection()
		//that way you can nicely separate the two tires.
		boolean result = dbhndl.handelConnection(user);
		
		if (result) {
			return mapping.findForward(SUCCESS);
		}else
			return mapping.findForward(FAILURE);	
		
	}
}
