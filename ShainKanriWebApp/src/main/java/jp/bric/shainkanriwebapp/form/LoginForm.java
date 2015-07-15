package jp.bric.shainkanriwebapp.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Required;

public class LoginForm {

    //必須チェック
    @Required(arg0=@Arg(key="labels.loginUser"))
    public String loginUser;

    //必須チェック
    @Required(arg0=@Arg(key="labels.loginPassword"))
    public String loginPassword;

}
