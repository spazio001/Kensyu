package jp.bric.shainkanriwebapp.action;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;

import jp.bric.shainkanriwebapp.dto.UserDataDto;
import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.form.EntryForm;
import jp.bric.shainkanriwebapp.service.extend.ShainsExService;

public class EntryAction {

	@ActionForm
	@Resource
	protected EntryForm entryForm;

	@Resource
	protected ShainsExService shainsExService;

	@Resource
	protected UserDataDto userDataDto;

	@Resource
	protected HttpSession session;

	@Execute(validator = false)
	public String index() {
		return "entry.jsp";

	}

	// 登録ボタン押下時
	@Execute(validator = true, input = "entry.jsp")
	public String entry() throws ParseException {
		// 社員番号の重複チェック
		Shains shainForCheck = shainsExService.findByShainNo(entryForm.shainNo);
		if (shainForCheck == null) {

			// 社員番号が重複していなかった場合、登録する
			Shains shain = new Shains();
			shain.shainNo = Long.parseLong(entryForm.shainNo);
			shain.shainName = entryForm.shainName;
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			long shainBirthdayAsLong = df.parse(entryForm.shainBirthday).getTime();
			shain.shainBirthday = new Date(shainBirthdayAsLong);
			shain.shainSex = Integer.parseInt(entryForm.shainSex);
			shain.shainPostcode = entryForm.shainPostcode;
			shain.shainAddress = entryForm.shainAddress;
			shain.shainTelno = entryForm.shainTelno;
			long now = System.currentTimeMillis();
			shain.insertTime = new Timestamp(now);
			shain.lastUpdateTime = new Timestamp(now);

			shainsExService.registerShainTx(shain);

			return "complete.jsp";

		} else {
			// エラーメッセージを格納する
			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.existShain", entryForm.shainNo));
			ActionMessagesUtil.saveErrors(session, errors);

			return "entry.jsp";
		}
	}

	// 登録完了から検索画面へ
	@Execute(validator = false)
	public String research() {

		return "/search/";

	}

}
