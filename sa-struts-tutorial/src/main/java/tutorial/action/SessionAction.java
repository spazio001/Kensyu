package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.SessionForm;

public class SessionAction {

	@ActionForm
	@Resource
	protected SessionForm sessionForm;

	//初期画面
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	//nullの場合は、遷移しない。また、戻るボタン押下時に実行
	@Execute(input = "index.jsp")

	//firstに入力されていた場合に実行
	public String goSecond() {
		return "second.jsp";
	}

	//戻るボタン押下時に実行
	@Execute(validator = false)
	public String backSecond() {
		return "second.jsp";
	}

	//nullの場合、遷移しない。
	@Execute(input = "second.jsp")

	//secondに入力されていた場合に実行
	public String goThird() {
		return "third.jsp";
	}

	//クリアボタン押下時に実行。また、セッションスコープのアクションフォームを削除する。
	@Execute(validator = false, removeActionForm = true)
	public String clear() {
		return "index.jsp";
	}
}