package tutorial.action;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

public class AjaxAction {

    //初期表示
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	//helloボタンを押下された場合、レスポンスとして「こんにちは」を返す
	@Execute(validator = false)
	public String hello() {
		ResponseUtil.write("こんにちは");
		return null;
	}
}