package jp.bric.shainkanriwebapp.form;

import org.seasar.struts.annotation.Required;

public class LoginForm {

    //必須チェック
    @Required
    public String loginUser;

    //必須チェック
    @Required
    public String loginPassword;

}
