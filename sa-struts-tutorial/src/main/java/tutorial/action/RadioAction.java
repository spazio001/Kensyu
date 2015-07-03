package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.RadioForm;

public class RadioAction {

	@ActionForm
	@Resource
	protected RadioForm radioForm;

	//初期表示
	@Execute(validator = false)
	public String index() {
		radioForm.initialize();
		return "index.jsp";
	}

	//submitボタン押下時に実行
	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}