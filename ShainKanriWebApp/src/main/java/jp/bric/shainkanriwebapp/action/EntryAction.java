package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.bric.shainkanriwebapp.form.EntryForm;

public class EntryAction {

	@ActionForm
	@Resource
	protected EntryForm entryForm;


    @Execute(validator = false)
	public String index() {
        return "entry.jsp";

    }

}
