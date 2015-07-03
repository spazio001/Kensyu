package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class RedirectAction {

    //初期表示
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}


	//ボタン押下時に実行し、リダイレクト（他サイト）に遷移する
	@Execute(validator = false, redirect = true)
	public String showGoogle() {
		return "http://www.google.co.jp";
	}

    @Execute(validator = false)
    public String showAmazon() {
        return "http://www.amazon.co.jp?redirect=true";
    }

}