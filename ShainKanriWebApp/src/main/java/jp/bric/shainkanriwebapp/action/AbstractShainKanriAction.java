package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import jp.bric.shainkanriwebapp.dto.UserDataDto;

public abstract class AbstractShainKanriAction {

	@Resource
	protected UserDataDto userDataDto;

	@Resource
	protected HttpSession session;

}
