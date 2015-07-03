package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.SelectForm;

public class SelectAction {

	@ActionForm
	@Resource
	protected SelectForm selectForm;

	//初期表示
	@Execute(validator = false)
	public String index() {
		selectForm.initialize();
		return "index.jsp";
	}

	//submit押下時に実行
	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}