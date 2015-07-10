package jp.bric.shainkanriwebapp.action;

import org.seasar.struts.annotation.Execute;

public class SearchAction {

    @Execute(validator = false)
	public String index() {
        return "search.jsp";

    }

}