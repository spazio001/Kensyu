package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.bric.shainkanriwebapp.form.ShelfEntryForm;

public class BulkEntryAction extends AbstractShainKanriAction {

	@ActionForm
	@Resource
	protected ShelfEntryForm shelfEntryForm;

	@Execute(validator = false)
	public String index() {

		return "shelfEntry.jsp";

	}

	@Execute(validator = false)
	public String entry() {

		return "complete.jsp";

	}

	// 登録完了から検索画面へ
	@Execute(validator = false)
	public String research() {

		return "/search/";

	}

}
