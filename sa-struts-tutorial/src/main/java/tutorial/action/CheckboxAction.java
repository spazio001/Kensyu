package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.CheckboxForm;

public class CheckboxAction {

    //ActionFormの呼び出し
	@ActionForm
	@Resource
	protected CheckboxForm checkboxForm;

	@Execute(validator = false)
	public String index() {
	    //下記のFormを実行する。
		checkboxForm.initialize();
		return "index.jsp";
	}

	//ボタン押下時に、reset()メソッドを実行し、submit.jspを表示する。
	@Execute(validator = false, reset = "reset")
	public String submit() {
		return "submit.jsp";
	}
}