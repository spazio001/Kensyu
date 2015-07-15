package jp.bric.shainkanriwebapp.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;

import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.form.EntryForm;
import jp.bric.shainkanriwebapp.service.extend.NewExService;

public class EntryAction {

	@ActionForm
	@Resource
	protected EntryForm entryForm;

	@Resource
	protected NewExService newExService;

	@Resource
	protected HttpSession session;


    @Execute(validator = false)
	public String index() {
        return "entry.jsp";

    }

    //登録ボタン押下時
    @Execute(validator = true,input="entry.jsp")
    public String entry() {
       	//社員番号の重複チェック
    	Shains shainNo = NewExService.findByShain(entryForm.shainNo);
    	if( shainNo != null ) {
    		//TODO 社員番号が重複していなかった場合、登録する

    		return "/complete/";

    	} else {
    		//エラーメッセージを格納する
    		ActionMessages errors = new ActionMessages();
        	errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.shainNo", true));
        	ActionMessagesUtil.saveErrors(session, errors);

    		return "entry.jsp";
    	}
    }

}
