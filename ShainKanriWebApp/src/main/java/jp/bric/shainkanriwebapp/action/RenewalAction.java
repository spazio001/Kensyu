package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.bric.shainkanriwebapp.form.RenewalForm;

public class RenewalAction {

	@ActionForm
	@Resource
	protected RenewalForm renewalForm;

	@Execute(validator = false)
	public String index() {
        return "renewal.jsp";

    }

}
