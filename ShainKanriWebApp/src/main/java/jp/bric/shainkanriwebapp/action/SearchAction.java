package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.bric.shainkanriwebapp.form.SearchForm;

public class SearchAction extends AbstractShainKanriAction {

	@ActionForm
	@Resource
	protected SearchForm searchForm;

	@Execute(validator = false)
	public String index() {

		return "search.jsp";

	}

	@Execute(validator = false, input = "search.jsp")
	public String search() {
		//検索ボタン押下時の処理
		return null;
	}

	@Execute(validator = false, input = "delete/complete.jsp")
	public String delete() {

		//社員削除ボタン押下時の処理
		return "delete/complete.jsp";

	}

	// 社員削除完了から検索画面へ
	@Execute(validator = false)
	public String research() {

		return "/search/";

	}


}