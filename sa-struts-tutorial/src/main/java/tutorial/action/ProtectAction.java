package tutorial.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.Execute;

public class ProtectAction {

	@Resource
	protected HttpServletRequest request;

	//初期表示
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	//tomcatボタン押下時に実行
	@Execute(validator = false, roles = "tomcat,role1")
	public String tomcat() {
		return "tomcat.jsp";
	}
}