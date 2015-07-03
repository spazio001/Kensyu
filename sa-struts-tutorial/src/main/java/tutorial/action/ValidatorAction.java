package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.ValidatorForm;

public class ValidatorAction {

	@ActionForm
	@Resource
	protected ValidatorForm validatorForm;

	//初期表示
	@Execute(validator = false)
	public String index() {
		validatorForm.initialize();
		return "index.jsp";
	}

	//エラーが起きた場合には、@Executeが実行される
	@Execute(input = "index.jsp")
	public String submit() {
		return "index.jsp";
	}
}