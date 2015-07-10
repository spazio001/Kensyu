package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;

import jp.bric.shainkanriwebapp.dto.UserDataDto;
import jp.bric.shainkanriwebapp.entity.Users;
import jp.bric.shainkanriwebapp.form.LoginForm;
import jp.bric.shainkanriwebapp.service.extend.UsersExService;

public class LoginAction {

	@ActionForm
	@Resource
	protected LoginForm loginForm;

	@Resource
	protected UsersExService usersExService;

	@Resource
	protected UserDataDto userDataDto;

	@Resource
	protected HttpSession session;

	@Execute(validator = false)
	public String index() {
        return "login.jsp";

    }

    //ログインボタン押下時
    @Execute(validator = true,input="login.jsp")
    public String login() {
    	//ログインのチェック
    	Users loginUser = usersExService.findByIdAndPassword(loginForm.loginUser, loginForm.loginPassword);
    	if( loginUser != null ) {
    		//ログインユーザーをセッションに保存
    		userDataDto.loginUser = loginUser.loginUser;
    		userDataDto.roleType = loginUser.roleType;

    		return "/search/";

    	} else {
    		//エラーメッセージを格納する
    		ActionMessages errors = new ActionMessages();
        	errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.login", true));
        	ActionMessagesUtil.saveErrors(session, errors);

    		return "login.jsp";

    	}
    }

}
