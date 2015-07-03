package tutorial.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.TokenProcessor;
import org.seasar.struts.annotation.Execute;

public class TokenAction {

	@Resource
	protected HttpServletRequest request;

	//初期表示
	@Execute(validator = false)
	public String index() {

	    //トークンの設定
		TokenProcessor.getInstance().saveToken(request);
		return "index.jsp";
	}

	//ボタン押下時に実行
	//vakidateメソッドにて、トークンチェックをする。
	@Execute(validator = false, validate = "validate", input = "index.jsp")
	public String result() {
		return "result.jsp";
	}

	//トークンチェック
	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"errors.invalid",
				"Token"));
		}
		return errors;
	}
}