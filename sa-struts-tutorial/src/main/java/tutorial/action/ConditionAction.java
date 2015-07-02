package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.ConditionForm;

public class ConditionAction {

	@ActionForm
	@Resource
	protected ConditionForm conditionForm;

	//idの入力により、表示パターンが切り替わる。
	@Execute(validator = false, urlPattern = "{id}")
	public String index() {
		return "index.jsp";
	}
}