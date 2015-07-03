package tutorial.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.Execute;

public class LogoutAction {

    //セッションの開始
	@Resource
	protected HttpSession session;

	//初期表示
	@Execute(validator = false)
	public String index() {
	    //セッションを破棄
		session.invalidate();
		return "index.jsp";
	}
}