package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.ClientValidatorForm;

public class ClientValidatorAction {

	@ActionForm
	@Resource
	protected ClientValidatorForm clientValidatorForm;

	//初期表示
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	//submitメソッドの実行
	@Execute(input = "index.jsp")
	public String submit() {
		return "index.jsp";
	}

	//submit2メソッドの実行
	@Execute(input = "index.jsp")
	public String submit2() {
		return "index.jsp";
	}
}