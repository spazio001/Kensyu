package jp.bric.shainkanriwebapp.action;

import org.seasar.struts.annotation.Execute;

public class ErrorAction {

	@Execute(validator = false)
	public String index() {

		return "error.jsp";

	}

	@Execute(validator = false)
	public String research() {

		return "/search/";

	}

}
