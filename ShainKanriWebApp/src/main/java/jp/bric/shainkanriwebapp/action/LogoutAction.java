package jp.bric.shainkanriwebapp.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

public class LogoutAction extends AbstractShainKanriAction {

	@Execute(validator = false)
	@RemoveSession(name = "userDataDto")
	public String index() {
		// セッションを破棄
		// session.invalidate();
		return "logout.jsp";

	}

	@Execute(validator = false)
	public String close() {

		return null;

	}

}
