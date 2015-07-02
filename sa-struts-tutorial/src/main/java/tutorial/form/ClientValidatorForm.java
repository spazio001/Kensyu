package tutorial.form;

import org.seasar.struts.annotation.Required;

public class ClientValidatorForm {

    //submitボタン押下時、aaaの入力チェック
	@Required(target = "submit")
	public String aaa;

    //submit2ボタン押下時、bbbの入力チェック
	@Required(target = "submit2")
	public String bbb;
}